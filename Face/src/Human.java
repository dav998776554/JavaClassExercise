
public class Human {
	private String name;
	private int age;
	public Human() {
		
	}
	public Human(String name) {
		this.name = name;
	}
	public Human(String name,int age) {
		this(name);
		this.age = age;
	}
	@Override
	public String toString() {
		return this.name;
	}
	
}
