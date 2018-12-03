import java.util.*;

public class Students {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("請輸入學生數量");
		int c = sca.nextInt();
		for(int i = 0; i <= c ; i++) {
			System.out.println("請輸入學生名稱");
			String a = sca.nextLine();
			System.out.println("請輸入學生學號");
			String b = sca.nextLine();
		}
		Set<Student> set = new HashSet<>();
		set.add(new Student("a","b"));
		System.out.println(set);
	}

}
