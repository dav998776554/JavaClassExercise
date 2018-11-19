import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList(1);
		int sum = 0;
		while(true) {
			System.out.println("請輸入數字");
			int number = sca.nextInt();
			if(number==0) {
				break;
			}
			al.add(number);
		}
		System.out.printf("陣列長度 ： %d %n",al.size());
		for(int i = 0 ; i < al.size(); i++) {
			System.out.printf("第%d索引   值為：%2d %n",i,al.get(i));
			sum += al.get(i);
		}
		System.out.printf("陣列內容值總合：%d %n",sum);
	}

}
