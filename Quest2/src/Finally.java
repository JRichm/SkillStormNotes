import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finally {

	public static void main(String[] args) {
		FileInputStream f = null;
		try {
			f = new FileInputStream("demo2.txt");
			System.out.println(f.read());
			
		} catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException");
			
		} catch(IOException e) {}
		finally {
			System.out.println("Finally");
			// try-with resources statement (this is not it but research)
			if (f != null) {
				try {
					f.close();
				} catch(IOException e) {
					System.out.println("");
				}
			}
		}
	}
}