package simplefirstprogram;
import java.util.LinkedList;
public class Link {
	public static void main(String[]args) {
		LinkedList<String> color = new LinkedList<String>();
		color.add("red");
		color.add("black");
		color.add("green");
		color.addFirst("white");
		color.addLast("pink");
		System.out.println(color);
		color.removeFirst();
		color.removeLast();
		System.out.println(color);
		
		
	}
}
