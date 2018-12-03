import java.util.*;

public class WordCount {

	public static void main(String[] args) {
		String line = input("請輸入一串英文字：  \n");
		Set<String> words = tokens(line);
		System.out.printf("不重複的單字有： %d 個 ：%s%n",
				words.size(),words);
	}
	
	
	static String input(String prompt) {
		System.out.print(prompt);
		Scanner sca = new Scanner(System.in);
		String line = sca.nextLine();
		return line;
	}
	
	static Set<String> tokens(String line){
		String[] tokens = line.split(" ");
		Set<String> words = new HashSet<>();
		for(String token : tokens) {
			words.add(token);
		}
		return words;
	}

}
