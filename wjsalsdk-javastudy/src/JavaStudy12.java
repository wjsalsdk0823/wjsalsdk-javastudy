import java.util.ArrayList;
import java.util.Scanner;

public class JavaStudy12 {

	public static void main(String[] args) {
		//ArrayList/Scanner이용
		//학생들의 수학점수를 읽어들이는 프로그램
		//-1이 들어올때까지 ArrayList에 입력값이 채워지면서 늘어난다
		Scanner a = new Scanner(System.in); 
		int n=a.nextInt();
		while(n!=-1) {
			
			n=a.nextInt();
		}
		
	}
}
