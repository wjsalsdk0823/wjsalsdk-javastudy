import java.util.Scanner;

public class JavaStudy9 {

	public static void main(String[] args) {
		// 12 24 ���� �ΰ�.
		//12 : 2 3 4 6 12
		//24 : 2 3 4 6 8 12 24
		//�ּҰ����(�μ��� ������ �� ���� ���� ��) =>24
		//�ִ�����(�μ��� �� �� ���� ū��)=> 6
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
		System.out.println("�ִ�����["+(mn/least)+"]");
		System.out.println("�ִ�����["+least+"]");
		}				
	}
		//�Ʒ��� 1����100������ ���� ���ϴ� �ڵ�
		//int a=1;
		//int b=0;
		//System.out.println();
		//for(a=1; a<=100; a++) {
			//b+=a;  b+=a -> b+a = a;
			//System.out.println(b);
	//	}
//	}

//}
