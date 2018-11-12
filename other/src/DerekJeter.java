public class DerekJeter extends Human implements Swimmer{
	public DerekJeter(String name){
		super(name);
	}
	public void swim(){
		System.out.printf("棒球選手 %s 在水裡打棒球%n",name);
	}
}