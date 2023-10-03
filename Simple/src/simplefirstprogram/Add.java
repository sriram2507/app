package simplefirstprogram;

public class Add {
//	Addition
//	public int addnumbers(int num1,int num2) {
//		int sum = num1+num2;
//		return sum;
//	}
//	public static void main (String []args) {
//		int a = 10;
//		int b = 10;
//		Add obj=new Add();
//		int add = obj.addnumbers(a,b);
//		System.out.println(add);
//	}
	
//	subraction
	public int subnumber(int a,int b) {
		int sum = a-b;
		return sum;
		
	}
	public static void main(String[]args) {
		int c =10;
		int d = 10;
		Add obj=new Add();
		int sub = obj.subnumber(c, d);
		System.out.println(sub);
		
	}
}
