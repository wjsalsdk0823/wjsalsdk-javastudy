import java.util.Scanner;

public class JavaStudy10 { 

	public static void main(String[] args) {
		System.out.print("팩토리얼 연산할 값: ");
		Scanner a = new Scanner(System.in); 
		//a라는 스캐너를 생성 -> new Scanner(System.in) 이라는 내용으로.
		int n = a.nextInt();
		//
		int fac =1;//팩토리얼 결과 값 변수..
		for(int i=1; i<=n; i++) {
			fac=fac*i;
			
		}
		System.out.print("결과: " +fac);
		
	}
}
