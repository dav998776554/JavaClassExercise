public class Demo{
	public static void main(String[] args){
		doSwim(new DerekJeter("德瑞克基特"));
		doSwim(new Shark("傑克伍德"));
		doPS(new Seaplane("空中監獄"));
		doFly(new Halcopt("黑鷹計畫"));
		doFly(new Flyfish("達悟族"));
		doGS(new Subway("鮪魚味"));
		doSwim(new Boat("鐵達尼號"));
		
	}
	
	public static void doSwim(Swimmer smer){
		smer.swim();
	}
	public static void doFly(Flyer fr){
		fr.fly();
	}
	public static void doPS(Seaplane pg){
		pg.fly();
		pg.swim();
	}
	public static void doGS(Subway sb){
		sb.drive();
	}
}