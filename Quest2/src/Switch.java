
public class Switch {

	public static void main(String[] args) {
		switchCase("C");
	}
	
	static void switchCase(String val) {
		switch (val) {
		case "A": {
			System.out.println("value is A");
			break;
		}
		case "B": {
			System.out.println("value is B");
			break;
		}
		default: {
			System.out.println("Default value");
			break;
		}
		}
	}
}
