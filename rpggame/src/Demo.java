import Role.*;
import java.util.Scanner;

public class Demo implements Acation{
	public static void main(String[] args){
		Swordsman s1 = new Swordsman("John",1,100);
		Magic m1 = new Magic("Wick",1,70);
				
		showrole(s1);
		System.out.print("\n");
		showrole(m1);
		System.out.print("\n");

		scoSomeone(m1,s1);
		System.out.print("\n");
		Scanner sca = new Scanner(System.in);
		int moves = 0;
		do{
			System.out.println("請輸入前進方向 1:向東 2:向南 3:向西 4:向北 0:休息一日 調整狀態");
			moves = sca.nextInt();
			if(moves == 0){
				System.out.println("原地扎營");
				break;
			}
			move(moves);
		}while(true);
		

	}
	
	public static void move(int aca){
		switch(aca){
			case Acation.STOP:
				System.out.println("原地扎營");
				break;
			case Acation.RIGHT:
				System.out.println("向東走");
				break;
			case Acation.LEFT:
				System.out.println("向南走");
				break;
			case Acation.UP:
				System.out.println("向西走");
				break;
			case Acation.DOWN:
				System.out.println("向北走");
				break;
			default:
				System.out.println("不支援此指令");
		}
	}
	
	static void showrole(Role r1){
		System.out.printf("名稱：%s \n職業：%s \n等級：%d \n血量：%d %n",
		r1.getName(),r1.getCareer(),r1.getLevel(),r1.gethp());
	}
	
	public static void showfight(Role r2){
		System.out.printf("%s 使用 %s %n",r2.getName(),r2.fight());
	}
	
	public static void scoSomeone(Magic m1 ,Role r2){
		System.out.printf("%s 對 %s 使用了 %s%n", m1.getName(),r2.getName() , m1.sco());
		System.out.printf("%s 回復了少許生命%n", r2.getName());
	}
	
}