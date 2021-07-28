import java.util.Scanner;

public class JavaStudy9 {

	public static void main(String[] args) {
		// 12 24 숫자 두개.
		//12 : 2 3 4 6 12
		//24 : 2 3 4 6 8 12 24
		//최소공배수(두수의 공통배수 중 가장 작은 수) =>24
		//최대공약수(두수의 앿 중 가장 큰수)=> 6
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int mn=m*n;
		int small=0;
		int least=1; 
		int i;
		do {
			if(m>n)small=n;
			else small=m;
		for(i=2; i<=small;i++) {
			if(m%i==0 && n%i==0) {
				least=least*i;
				m=m/i;
				n=n/i;
				break;
			}
		}			
		}while(i<=small && m!=1 && n!=1);
		System.out.println("최대공배수["+(mn/least)+"]");
		System.out.println("최대공약수["+least+"]");
		}				
	}
		//아래꺼 1에서100까지의 합을 구하는 코드
		//int a=1;
		//int b=0;
		//System.out.println();
		//for(a=1; a<=100; a++) {
			//b+=a;  b+=a -> b+a = a;
			//System.out.println(b);
	//	}
//	}

//}
