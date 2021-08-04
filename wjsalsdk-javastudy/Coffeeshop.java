import java.util.Scanner;

public class Coffeeshop {

public static void main(String[] args) {
	Menu menu=new Menu();
    //menu.showMenu();
	
	Scanner s=new Scanner(System.in); //문자형 스캐너
  	Scanner u=new Scanner(System.in);//정수형 스캐너
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
        		 menu.appendmenu();	        		         		         		         		 
        		 break;        		  
        	 case"r":
	        	 menu.showMenu();//메뉴목록보기
        		 break;       		 
        	 case"u":
        		menu.changeMenu();
        		 break;        		
        	 case"d":  		
        		 menu.deleteMenu();
        	 }	 
        	  //메뉴작업을 선택하시오 출력
        	 System.out.println("메뉴 작업을 선택하시오.(c:추가,r:목록보기,u:수정,d:삭제)");	        	  
        	 a = s.nextLine();
         }	 
         menu.save();
         break;
         case"o":
        	 System.out.println("주문받기");
        	 menu.showMenu();
        	 Order order = new Order();
        	 //출력 "메뉴번호를 선택하세요"   
        	 System.out.println("메뉴번호:");
        	 //값을 읽는다
        	 String st=s.nextLine();//문자형을 아래 정수로 바꿈 int menu_num= Integer.parseInt(st);
        	 //메뉴번호가""이 아닌 동안
        	 while(!st.equals("")) {
        		 int menu_num= Integer.parseInt(st);//정수형으로 바꿈
        		 //출력 "수량을 입력하세요"
        		 System.out.println("수량:");
        		 //값을 읽는다.
        		 int cnt=u.nextInt();       		 
        		 //메뉴명을 읽는다
        		 //주문을 order에 추가 (order.addOrder(메뉴명.수량);)
        		 int total=order.addOrder(menu.getName(menu_num),menu.getPrice(menu_num),cnt);//order클래스의 함수동작을 여기 클래스에서 쓴다
        	 	//계산해서 총액 출력      	        		 
        	 System.out.println("총액:");  
        	 
        	 	menu.showMenu();        	 
        	 	//출력"메뉴번호를ㄹ 선택하세요"
        	 System.out.println("메뉴번호:");
        	 	//값을 읽는다
        	 	int u2=u.nextInt();
        	 //전체총액:00000
        	 	
        	 //각 메뉴의 총액을 더한 전체 총액을 출력(getTotalsum())
        	 //출력"모바일 번호를 입력핫세요"
        	 	System.out.println("모바일 번호");
        	 //주문고객의 모바일 번호 입력받는다	 
        	 }        	 	       	       	        	 
        	 break;
         case"s":
        	 System.out.println("실적보기");
        	 break;
         }	         
         System.out.println("작업을 선택하시오(m:메뉴관리,o:주문받기,s:실적보기,x:프로그램종료)");
         str=s.nextLine();	         
      }
      System.out.println("프로그램종료");
      s.close();
	}
}
