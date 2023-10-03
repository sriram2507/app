package simplefirstprogram;

public class H {
	public void studentDetail(String Name) {
		System.out.println(Name);
	}
	public void studentDetail(int age) {
		System.out.println(age);
	}
	public void studentDetail(float salary) {
		System.out.println(salary);
	}
	public static void main(String[]args) {
		H obj =new H();
		obj.studentDetail("sri");
		obj.studentDetail(22);
		obj.studentDetail(25000.20f);
	}
}
