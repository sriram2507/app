package simplefirstprogram;

public class Second extends First {
	public void studentMark(){
		System.out.println(80);
	}
	public static void main (String[]args) {
		Second obj = new Second();
		obj.studentName();
		obj.studentAge();
		obj.studentMark();
		obj.property();
	}
}
