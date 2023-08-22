
public class Scopes {

	public static void main(String[] args) {
		Person one = new Person();
		Person two = new Person();
		
		one.age = 10;
		two.age = 20;
		Person.planet = "Earth";
		System.out.println(Person.planet);
	}

}

class Person {
	// instance variable (stored for each instance)
	int age;
	// class variable (shared amongst all person instances)
	static String planet;
	
	//local
	public void move(int distance) {
		// can only access distance variable inside method scope
		distance = 10;
	}
}