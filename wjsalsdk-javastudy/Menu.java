import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu { // 선언(정의) only. not 실행코드 
   private ArrayList<String> alName;
   private ArrayList<Integer> alPrice;

   
   Menu() {
      alName=new ArrayList<String>();
      alPrice=new ArrayList<Integer>();
      this.load();
//      addName("Americano");
//      addName("Espresso");
//      addName("Latte");
//      addPrice(2000);
//      addPrice(2500);
//      addPrice(3000);
      
//      showMenu();
   }
   /* 생성자 - 일종의 메소드
    *         용도: 주로 초기화 작업용. 
              명명법: 이름이 클래스와 같아야 함.
              반환값: 반환값이 없다.(반환할 수 없이, 작업만 실행)
              실행/호출: new연산자가 실행된 직후, 자동실행
              다른 메소드/생성자를 호출할 수 있다.
   */
   void addName(String name) {
      this.alName.add(name);
   }
   void addPrice(int price) {
      this.alPrice.add(price);
   }
   void addPrice(String price) {
      this.alPrice.add(Integer.parseInt(price));
   }
   String getName(int menu_num) {
	   return this.alName.get(menu_num-1);
   }
   Integer getPrice(int name) {
	   return this.alPrice.get(name-1);
   }
   void appendmenu() {
	   System.out.println("새메뉴명 :");
		 //새메뉴명 읽기     
	   Scanner s1=new Scanner(System.in);
		 String i = s1.nextLine();
		 if(i.equals("")||i==null) {
			 System.out.println("유효하지 않은 이름입니다");
			 return;
		 }
		//새가격 읽기
		 System.out.println("새가격 읽기");
		 Scanner s2=new Scanner(System.in);
		 int l=s2.nextInt();
		 if(l<=0) {
			 System.out.println("유효하지 않은 가격입니다");
			 return;
		 }
		//메뉴명 추가
		 this.addName(i);
		//메뉴가격 추가
		 this.addPrice(l);		      		
   }
   void changeMenu() {	 
	 System.out.println("수정할메뉴번호");
	 //수정할 메뉴번호 읽기
	 Scanner  c1=new Scanner(System.in);
	 int t=c1.nextInt();
	 c1.nextLine();
	 //수정할 메뉴명 읽기
	 System.out.println("수정할메뉴");
	 Scanner  c2=new Scanner(System.in);
	 String y=c2.nextLine();
	 //수정할 가격 읽기      
	 System.out.println("새가격") ;
	 int as=c1.nextInt();
	 //메뉴번호에 해당하는 메뉴명 가격 수정
	 this.alName.set(t-1,y);
	 this.alPrice.set(t-1, as);
   }
   void deleteMenu() {
	   System.out.println("삭제할메뉴");
	   Scanner de=new Scanner(System.in);
	   int num=de.nextInt();
	  this.alName.remove(num-1);   
   }
   void showMenu() {
      for(int i=0; i<this.alName.size();i++) {
         System.out.println((i+1)+"\t"+this.alName.get(i)+"\t"+this.alPrice.get(i));
      }
   }
   void save() { // arrayList alName,alPrice를 화일(menu.txt)에 저장
       File file=new File("d:/menu.txt");
       if(file.exists()) {
          try {
             BufferedWriter writer = new BufferedWriter(new FileWriter(file));
             for(int i=0;i<this.alName.size();i++) {
                String line = this.alName.get(i)+","+this.alPrice.get(i);
                writer.write(line);
                if((i+1)!=this.alName.size())
                   writer.write("\r\n");
             }
             writer.flush();
             writer.close();
          } catch (IOException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
          }
       }

    }
   void load() {//화일(menu.txt을 읽어서 arrayList alNami,alprice에로드
      File file=new File("c:/tmp/menu.txt");
      if(file.exists()) {
         BufferedReader inFile = null;
         try {
            inFile = new BufferedReader(new FileReader(file));
         } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
         String line;
         try {
            line = inFile.readLine();
            while(line!=null) {
               String[] parts=line.split(",");
               addName(parts[0]);
               addPrice(parts[1]);
               line=inFile.readLine();
            }
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }

   }
}