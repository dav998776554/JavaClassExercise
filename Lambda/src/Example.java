import java.util.Arrays;
import java.util.Comparator;

public class Example {
	public static void main(String[] args) {
		test();
	}
	
	
	public static void test() {
		Comparator<String> byLegth = (name1,name2) -> name1.length()-name2.length();
		
		
		String[] name = {"Johsan","Stack","People"};
		Arrays.sort(name,(name1,name2) -> name1.length()-name2.length());
		for(String names : name) {
			System.out.println(name);
		}
	}
}

