package simplefirstprogram;

public class Acct implements Bank{
	public void branch() {
		System.out.println("tnagar");
	}
	public void acctname() {
		System.out.println("savings");
	}
	
	public static void main(String[]args) {
		Acct obj = new Acct();
		obj.branch();
		obj.acctname();
		
	}
}
