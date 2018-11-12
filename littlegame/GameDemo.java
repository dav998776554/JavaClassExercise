import java.util.Scanner;

public class GameDemo extends Gametest{
	private Scanner sca = new Scanner(System.in);
	
	public void print(String text){
		System.out.print(text);
	}
	
	public int nextInt(){
		return sca.nextInt();
	}
}