import java.util.Scanner;

public class Average4 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		double sum = 0;
		int count = 0;
		int num;
		while(true) {
			num = nextInt();
			if(num == 0) {
				break;
			}
			sum+=num;
			count++;
		}
		System.out.printf("平均 %.2f%n",sum/count);
	}
	static Scanner sc = new Scanner(System.in);
	static int nextInt() {
		String input = sc.next();
		while(!input.matches("\\d*")) {
			System.out.println("請輸入數字");
			input = sc.next();
		}
		return Integer.parseInt(input);
	}
}
