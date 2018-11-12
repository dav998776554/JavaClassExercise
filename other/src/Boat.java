public class Boat implements Swimmer{
	protected String name;
	
	public Boat(String name){
		this.name = name;
	}
	
	public void swim(){
		System.out.printf("船隻 %s 海上航行%n",this.name);
	}
}