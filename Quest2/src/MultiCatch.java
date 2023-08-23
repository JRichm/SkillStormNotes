import java.util.concurrent.ExecutionException;
import java.util.zip.DataFormatException;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			process();
			// specialized exceptions first -> more generalized exceptions
		}
		catch(ExecutionException | DataFormatException e) {}
	}
	
	static void process() throws DataFormatException, ExecutionException {
		// code that may or may not throw one of these exceptions
	}
}
