import java.util.*;

class StringComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.compareTo(s2);
	}
	
}

public class Sort5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("X","A","O","P","T","Y","D","M");
		Collections.sort(words, new StringComparator());
		System.out.println(words);
	}

}
