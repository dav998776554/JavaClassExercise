import java.util.*;
import static java.lang.System.out;;

public class ForEach {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Tomcalcye","John","Wick");
		names.forEach(out::println);
		new HashSet(names).forEach(out::println);
		new ArrayDeque(names).forEach(out::println);

	}
	
	public static void forEach(Iterable ite) {
		for(Object o : ite) {
			System.out.println(o);
		}
	}

}
