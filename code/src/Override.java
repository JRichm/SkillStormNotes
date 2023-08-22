
public class Override {

	public static void main(String[] args) {
		Poppable obj = new Bubble();
		obj.pop();
	}

}

class Poppable {
	public void pop() {
		System.out.println("Pop");
	}
}

class Balloon extends Poppable {
	public void pop() {
		System.out.println("POP!");
	}
	
	public void pop(int x) {} // this is overloading, NOT overriding
}

class Bubble extends Poppable {
	public void pop() {
		System.out.println("p");
	}
}