import java.util.*;

class ReversedStringOrder implements Comparator<String> {
	@Override
	public int compare(String s1,String s2) {
		return -s1.compareTo(s2);
	}
}

public class Demo3{
	
	public static void main(String[] args) {
		String[] words = {"B","X","A","M","F","W","O"};
		Arrays.sort(words , new ReversedStringOrder());
		for(String word:words) {
			System.out.println(word);
		}
	}

}
