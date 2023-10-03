package simplefirstprogram;
import java.util.HashMap;
public class Mapping {
	public static void main(String[]args) {
		HashMap<Integer,String> name = new HashMap<Integer,String>();
		name.put(1, "sri");
		name.put(2, "ram");
		System.out.println(name);
		System.out.println(name.get(2));
		
	}
}
