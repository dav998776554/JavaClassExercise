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
			System.out.println("找不到指定檔案或路徑 請重新輸入檔案名稱或檢查路徑是否正確");
		}

	}

}
