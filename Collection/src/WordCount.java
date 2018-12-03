import java.util.*;

public class WordCount {

	public static void main(String[] args) {
		String line = input("�п�J�@��^��r�G  \n");
		Set<String> words = tokens(line);
		System.out.printf("�����ƪ���r���G %d �� �G%s%n",
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
