public class Alpane implements Flyer{
	protected String name;
	public Alpane(String name){
		this.name = name;
	}
	
	public void fly(){
		System.out.printf("飛機 %s 飛在空中 %n",this.name);
	}
}