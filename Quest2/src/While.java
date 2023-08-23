
public class While {

	public static void main(String[] args) {
		loop();
	}

	static void loop() {
		boolean running = true;
		while (running) {
			System.out.println("running");
			running = check();
		}
	}
	
	static boolean check() {
		if (Math.random() < 0.5) {
			return false;
		} else {
			return true;
		}
	}
}
