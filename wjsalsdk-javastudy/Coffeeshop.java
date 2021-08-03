import java.util.Scanner;

public class Coffeeshop {

	public static void main(String[] args) {
		Menu menu=new Menu();
	    //menu.showMenu();
		
		Scanner s=new Scanner(System.in);
		System.out.println("작업을 선택하시오(m:메뉴관리,o:주문받기,s:실적보기,x:프로그램종료)");
		String str=s.nextLine();
	      while(!str.equals("x")) {
	         switch(str) {
	         case"m":
	         System.out.println("메뉴받기"); 
	         
	         menu.showMenu();
	         //CRUD 
	         System.out.println("메뉴 작업을 선택하시오.(c:추가,r:목록보기,u:수정,d:삭제)");
	         //값을 읽는다
	         String a = s.nextLine();
	         //q가 아닌동안
	         while (!a.equals("q")) {
	        	 switch(a) {  
	        	 //CRUD
	        	 case"c":
	        		 System.out.println("추가");
	        		 //새메뉴명 읽기     
	        		 String i = s.nextLine();
	        		//새가격 읽기
	        		 System.out.println("새가격 읽기");
	        		 int l=s.nextInt();
	        		//메뉴명 추가
	        		 menu.addName(i);
	        		//메뉴가격 추가
	        		 menu.addPrice(l);
	        		 System.out.println("메뉴가격추가");
	        		 String st=s.nextLine();        		
	        		         		         		         		 
	        		 break;        		  
	        	 case"r":
		        	 menu.showMenu();//메뉴목록보기
	        		 break;       		 
	        	 case"u":
	        		 System.out.println("이름/가격 수정");
	        		 //수정할 메뉴번호 읽기
	        		 int t=s.nextInt();
	        		 s.nextLine();
	        		 //수정할 메뉴명 읽기
	        		 String y=s.nextLine();
	        		 //수정할 가격 읽기        		 
	        		 int as=s.nextInt();
	        		 s.nextLine();
	        		 menu.changeMenu(t,y,as);
	        		 System.out.println("수정완료");
	        		 break;        		
	        	 case"d":
	        		 System.out.println("삭제");
	        		 //삭제할 메뉴번호 읽기
	        		 int de=s.nextInt();
	        		 //메뉴 삭제.
	        		 menu.deleteMenu(de);
	        	 }	 
	        	  //메뉴작업을 선택하시오 출력
	        	 System.out.println("메뉴 작업을 선택하시오.(c:추가,r:목록보기,u:수정,d:삭제)");	        	  
	        	 a = s.nextLine();
	         }	     	        	         	        	        	       
	         break;
	         case"o":
	         System.out.println("주문받기");
	         break;
	         case"s":
	         System.out.println("실적보기");
	         break;
	         case"x":
	         System.out.println("프로그램종료");
	         break;
	         }	         
	         System.out.println("작업을 선택하시오(m:메뉴관리,o:주문받기,s:실적보기,x:프로그램종료)");
	         str=s.nextLine();	         
	      }
	}
}
