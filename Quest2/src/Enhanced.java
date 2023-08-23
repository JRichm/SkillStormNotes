
public class Enhanced {

	public static void main(String[] args) {
		loop(new int[] {2,4,6,8,10});
	}
	
	static void loop(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
