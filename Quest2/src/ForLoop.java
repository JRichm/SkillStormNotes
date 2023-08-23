
public class ForLoop {

	public static void main(String[] args) {
		loop(10);
	}
	
	static void loop(int max) {
		for (int i = 0; i < max; i++) {
			System.out.println("we have passed through the loop " + i + " times!");
		}
	}
}
