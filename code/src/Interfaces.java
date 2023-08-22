
public class Interfaces {

	public static void main(String[] args) {
		
	}
}

interface Drawable {
	public abstract void draw();
}

interface Colorable extends Drawable {
	void color();
}

class Rectangle implements Drawable, Runnable {
	public void draw() {}
	public void run() {}
	
}

class Circle implements Colorable {
	public void color() {}
	public void draw() {}
}