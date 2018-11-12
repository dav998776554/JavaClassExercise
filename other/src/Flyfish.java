public class Flyfish extends Fish implements Flyer{
	public Flyfish(String name){
		super(name);
	}
	public void swim(){
		System.out.printf("飛魚 %s 游泳%n",name);
	}
	public void fly(){
		System.out.printf("飛魚 %s 翱翔天際%n",name);
	}
}