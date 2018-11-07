package Clothes;

public class Clothes{
	private String color;
	private String size;
	private int prize;
	
	public Clothes(){
	}
	
	public Clothes(String color){
		this();
		setColor(color);
	}
	
	public Clothes(String color , String size){
		this(color);
		setSize(size);
	}
	
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setSize(String size){
		this.size = size;
	}
	
	public String getsize(){
		return this.size;
	}
}