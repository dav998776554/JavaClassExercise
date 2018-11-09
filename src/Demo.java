import java.util.Scanner;
import Clothes.*;


public class Demo {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("輸入一下");
		String game = sca.nextLine();
		System.out.printf("%s %n",game);
		Clothes clo = new Clothes("red","M",1000);
		System.out.printf("顏色： %s , 尺寸：%s , 價格：%d%n",clo.getColor(),clo.getsize(),clo.getPrize());
		Clothes tsh = new T_shirt("green","9L",599);
		System.out.printf("T恤 顏色： %s , 尺寸：%s , 價格：%d",tsh.getColor(),tsh.getsize(),tsh.getPrize());
	}

}
