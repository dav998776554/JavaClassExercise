import java.util.InputMismatchException;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		double sum = 0;
		int count = 0;
		int num;
		while(true) {
			try {
				num = sca.nextInt();
				if(num == 0) {break;}
				sum += num;
				count++;
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				System.out.printf("略過錯誤的數值 %s%n",sca.next());
			}
		}
		System.out.printf("平均 %.2f%n",sum/count);
	}

}
