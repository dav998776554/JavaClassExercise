import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil {
	public static String readFile(String Name) throws FileNotFoundException {
		StringBuilder builder = new StringBuilder();
			try (Scanner sca = new Scanner(new FileInputStream(Name))){
				while(sca.hasNext()) {
					builder.append(sca.nextLine());
					builder.append('\n');
				}
			}catch(FileNotFoundException ex) {
				ex.printStackTrace();
				throw ex;
			}
		return builder.toString();
	}
}
