public class JavaStudy8 {

	public static void main(String[] args) {
		//2~10000���� ������ ��� �Ҽ��� ���϶�.
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

	


