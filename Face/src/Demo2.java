import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		ArrayList<Human> al = new ArrayList<Human>(1);
		while(true) {
			System.out.println("�п�J�m�W");
			String name = sca.next();
			if(name.equals("0")) {
				break;
			}
			al.add(new Human(name));
		}
		System.out.printf("�`�@�� %d��ȤH %n",al.size());
		for(int i = 0 ; i < al.size(); i++) {
			System.out.printf("��%d��ȤH�G%3s %n",i+1,al.get(i));
		}
	}

}
