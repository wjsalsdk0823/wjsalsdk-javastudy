import java.util.ArrayList;

public class Order {
   ArrayList<String> alMobile;
   ArrayList<String> alMenu;
   ArrayList<Integer> alCount;
   ArrayList<Integer> alTotal;
   
   Order() {
	   this.alMobile=new ArrayList<String>();
	   this.alMenu=new ArrayList<String>();
	   this.alCount=new ArrayList<Integer>();
	   this.alTotal=new ArrayList<Integer>();
   }
   
   int addOrder(String name,int price, int cnt) {
      //주문메뉴추가
	   this.alMenu.add(name);
	  //주무수량 추가t
	   this.alCount.add(cnt);
	  //합계 계산+추가	   
	   this.alTotal.add(price*cnt);
	   return price*cnt;
      
   }
//   		int getTotalSum() {
//	  // 주문리스트의 총액을 모두 더해서 합계 
//   		int m=0;
//	   for(int m <alTotal.size());
//	   return ;
//   }
//    
}
