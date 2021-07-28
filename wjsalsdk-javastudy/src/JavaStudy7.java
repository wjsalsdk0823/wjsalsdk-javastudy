public class JavaStudy7 {

	public static void main(String[] args) {
		//피보나치수열 10000이하 출력
		int first=0;
		int second=1;
		int third=first+second;//메인 무조건 한번 실행
		while(third<10000) {
			System.out.println(third);
			first=second;
			second=third;
			third=first+second;
		}
		}
}
