import java.util.*;

public class Students {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("�п�J�ǥͼƶq");
		int c = sca.nextInt();
		for(int i = 0; i <= c ; i++) {
			System.out.println("�п�J�ǥͦW��");
			String a = sca.nextLine();
			System.out.println("�п�J�ǥ;Ǹ�");
			String b = sca.nextLine();
		}
		Set<Student> set = new HashSet<>();
		set.add(new Student("a","b"));
		System.out.println(set);
	}

}
