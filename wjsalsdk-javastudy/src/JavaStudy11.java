import java.util.ArrayList;

public class JavaStudy11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pnt = new int[5];
		ArrayList<String> studentName=new ArrayList<String>();
		studentName.add("min");//����
		studentName.add("min");
		studentName.add("min");
		studentName.add("min");
		studentName.add("min");
		studentName.add("min");
		for(int i=0;i<studentName.size();i++) {
			System.out.println(studentName.get(i));//��ȸ
		}
		System.out.println("n\n\n");
		studentName.set(3, "Jefferson");//����
		for(int i=0;i<studentName.size();i++) {
			System.out.println(studentName.get(i));//��ȸ
		}
		studentName.remove(3);
		studentName.remove("min");
		//delete data and reduce the length
		studentName.clear();
		//method
		
		
	}

}
