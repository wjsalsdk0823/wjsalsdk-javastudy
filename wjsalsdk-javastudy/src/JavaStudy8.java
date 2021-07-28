public class JavaStudy8 {

	public static void main(String[] args) {
		//2~10000까지 사이의 모든 소수를 구하라.
		int a=2;
		for(int n=2; n<=10000; n++) {
			for(a=2; a<n; a++ ) {
				if(n%a==0) {
					break;
				}
			} 	
			if(n==a) {
				System.out.println(n);
			}				
		}
	}		
}		

	


