public class JavaStudy7 {

	public static void main(String[] args) {
		//�Ǻ���ġ���� 10000���� ���
		int first=0;
		int second=1;
		int third=first+second;//���� ������ �ѹ� ����
		while(third<10000) {
			System.out.println(third);
			first=second;
			second=third;
			third=first+second;
		}
		}
}
