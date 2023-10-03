package simplefirstprogram;
import java.util.ArrayList;
public class Array1 {
	public static void main(String[]args) {
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("black");
		System.out.println(color);
		color.set(0,"blue");
		System.out.println(color.get(1));
		color.remove(0);
		System.out.println(color);
	}
	}
