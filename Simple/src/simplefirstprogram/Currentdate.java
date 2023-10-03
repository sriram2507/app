package simplefirstprogram;
import java.time.LocalDateTime;
public class Currentdate {
	public static void main(String[]args) {
		LocalDateTime obj = LocalDateTime.now();
		System.out.println("current date & time "+obj);
	}
}
