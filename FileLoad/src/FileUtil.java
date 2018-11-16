import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil {
	public static String readFile(String Name) throws FileNotFoundException {
		StringBuilder builder = new StringBuilder();
			try {
				Scanner sca = new Scanner(new FileInputStream(Name));
				while(sca.hasNext()) {
					builder.append(sca.nextLine());
					builder.append('\n');
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw e;
			}
			System.out.print("�䤣����w�ɮ� �Э��s�]�w���|���ɮצW��");
		return builder.toString();
	}
}
