import java.util.Scanner;

public class JavaStudy10 { 

	public static void main(String[] args) {
		System.out.print("���丮�� ������ ��: ");
		Scanner a = new Scanner(System.in); 
		//a��� ��ĳ�ʸ� ���� -> new Scanner(System.in) �̶�� ��������.
		int n = a.nextInt();
		//
		int fac =1;//���丮�� ��� �� ����..
		for(int i=1; i<=n; i++) {
			fac=fac*i;
			
		}
		System.out.print("���: " +fac);
		
	}
}
