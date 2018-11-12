public abstract class Bird implements Swimmer,Flyer{
	protected String name;
	public Bird(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public abstract void swim();
	public abstract void fly();
}