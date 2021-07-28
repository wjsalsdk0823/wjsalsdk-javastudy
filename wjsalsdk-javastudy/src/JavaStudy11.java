import java.util.ArrayList;

public class JavaStudy11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pnt = new int[5];
		ArrayList<String> studentName=new ArrayList<String>();
		studentName.add("min");//생성
		studentName.add("min");
		studentName.add("min");
		studentName.add("min");
		studentName.add("min");
		studentName.add("min");
		for(int i=0;i<studentName.size();i++) {
			System.out.println(studentName.get(i));//조회
		}
		System.out.println("n\n\n");
		studentName.set(3, "Jefferson");//수정
		for(int i=0;i<studentName.size();i++) {
			System.out.println(studentName.get(i));//조회
		}
		studentName.remove(3);
		studentName.remove("min");
		//delete data and reduce the length
		studentName.clear();
		//method
		
		
	}

}
