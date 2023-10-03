package simplefirstprogram;

public class Stringmethod {
	public static void main(String[]args) {
		String firstname = "Sri";
		String secondname = "ram ";
		System.out.println(firstname.concat(secondname));
		System.out.println(firstname.length());
		System.out.println(firstname.toLowerCase());
		System.out.println(secondname.toUpperCase());
		System.out.println(secondname.charAt(2));
		System.out.println(secondname.contains("h"));
	}
}
