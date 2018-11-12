public class Eagle extends Bird{
	public Eagle(String name){
		super(name);
	}
	public void swim(){
		System.out.printf("老鷹 %s 游泳%n",name);
	}
	
	public void fly(){
		System.out.printf("老鷹 %s 飛向宇宙%n",name);
	}
}