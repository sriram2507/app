package simplefirstprogram;

public class Switch {
	public static void main(String[]args) {
		int months=11;
		switch(months) {
		case 1:
			System.out.println("january");
			break;
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("june");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("aug");
			break;
		case 9:
			System.out.println("sept");
			break;
		case 10:
			System.out.println("oct");
			break;
		case 11:
			System.out.println("nov");
			break;
		case 12:
			System.out.println("dec");
			break;
			default:
				System.out.println("invalid");
		}
	}
}
