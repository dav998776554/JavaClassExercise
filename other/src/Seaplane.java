public class Seaplane extends Alpane implements Swimmer{
	public Seaplane(String name){
		super(name);
	}
	
	public void fly(){
		System.out.printf("水上飛機 %s 飛在空中 %n",name);
	}
	public void swim(){
		System.out.printf("水上飛機 %s 水面滑行 %n",name);
	}
}