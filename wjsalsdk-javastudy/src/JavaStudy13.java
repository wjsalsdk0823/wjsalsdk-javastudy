public class JavaStudy13 {

	public static void main(String[] args) {
		//학생클래스로 인스턴스변수 s1을 만든다.
		//s1안의 필드들에 적당한 값을 넣는다.
		//s1안의 필드들의 값을 화면에 출력.
		Student s1= new Student();	
		s1.name="전민아";
		s1.nClass = 7;
		s1.nNumber = 50;
		s1.birthday="10001111";
		s1.gender = "female";
		s1.mobile = "01000000000";
		
		System.out.println("이름:" + s1.name);
		System.out.println("반:" + s1.nClass);
		System.out.println("학생번호:" + s1.nNumber);
		System.out.println("생일:" + s1.birthday);
		System.out.println("성별:" + s1.name);
		System.out.println("번호:" + s1.mobile);		
		
		System.out.println("");
		
		//컴퓨터 class
		//System.out.println("컴퓨터");
		//Computer a1= new Computer();
		//a1.
	}

}
