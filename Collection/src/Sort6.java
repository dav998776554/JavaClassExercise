import java.util.*;
import static java.util.Comparator.*;



public class Sort6 {
	public static void main(String[] args) {
		List words = Arrays.asList("X","A",null,"P","T",null,"D","M");
		words.sort(nullsFirst(reverseOrder()));
		System.out.println(words);
	}

}
