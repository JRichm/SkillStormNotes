import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatch {

	static FileInputStream file;
	
	public static void main(String[] args) {
		try {
			file = new FileInputStream("file.txt");
		} catch(FileNotFoundException e) {
			// recovery procedures
			// create file.. then open it
			// log exception
			
			System.out.println("File not found!");
		}
	}	
}
