package simplefirstprogram;
import java.util.HashSet;
public class Mapset {
	public static void main(String[]args) {
		HashSet<String> country = new HashSet<String>();
		country.add("India");
		country.add("usa");
		System.out.println(country.contains("usa"));
	}

}
