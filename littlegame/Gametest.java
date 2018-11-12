import java.util.Scanner;

public abstract class Gametest{
	public void go(){
		int num = (int)(Math.random() *100)+1;
		int guess;
		do{
			println("請輸入數字");
			guess = nextInt();
			if(guess > num){
				System.out.println("猜小點");
			}else if(guess < num){
				System.out.println("猜大點");
			}else{
		        System.out.println("猜中了");				
			}
		}while(guess != num);
	}
	
	public void println(String text){
		print(text + "\n");
	}
	public abstract void print(String text);
	public abstract int nextInt();
}