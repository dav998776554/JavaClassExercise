import java.util.Scanner;
import Clothes.*;


public class Demo {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("��J�@�U");
		String game = sca.nextLine();
		System.out.printf("%s %n",game);
		Clothes clo = new Clothes("red","M",1000);
		System.out.printf("�C��G %s , �ؤo�G%s , ����G%d%n",clo.getColor(),clo.getsize(),clo.getPrize());
		Clothes tsh = new T_shirt("green","9L",599);
		System.out.printf("T�� �C��G %s , �ؤo�G%s , ����G%d",tsh.getColor(),tsh.getsize(),tsh.getPrize());
	}

}
