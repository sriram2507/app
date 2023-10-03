package simplefirstprogram;

public class Pet extends Animal{
	public void dog() {
		System.out.println("puppy");
	}
	public static void main (String[]args) {
		Animal obj = new Animal();
		obj.dog();
	}
}
