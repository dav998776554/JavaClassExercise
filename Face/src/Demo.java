import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList(1);
		int sum = 0;
		while(true) {
			System.out.println("�п�J�Ʀr");
			int number = sca.nextInt();
			if(number==0) {
				break;
			}
			al.add(number);
		}
		System.out.printf("�}�C���� �G %d %n",al.size());
		for(int i = 0 ; i < al.size(); i++) {
			System.out.printf("��%d����   �Ȭ��G%2d %n",i,al.get(i));
			sum += al.get(i);
		}
		System.out.printf("�}�C���e���`�X�G%d %n",sum);
	}

}
