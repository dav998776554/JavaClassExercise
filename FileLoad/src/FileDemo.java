import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) {
		FileUtil fu = new FileUtil();
		Scanner sca = new Scanner(System.in);
		String name = sca.nextLine();
		try {
			fu.readFile(name);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("�䤣����w�ɮשθ��| �Э��s��J�ɮצW�٩��ˬd���|�O�_���T");
		}

	}

}
