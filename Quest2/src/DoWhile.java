
public class DoWhile {

	public static void main(String[] args) {
		loop(true);
	}

	static void loop(boolean running) {
		do {
			System.out.println("running");
			running = check();
		} while (running);
	}
	
	static boolean check() {
		if (Math.random() < 0.5) {
			return false;
		} else {
			return true;
		}
	}
}
