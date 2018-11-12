package Role;


public class Role{
	private String name;
	private int level;
	private int helthpoint;
	
	public void setname(String names){
		this.name = names;
	}
	public String getname(){
	    return this.name;
	}
	public void setlevel(int levels){
		this.level = levels;
	}
	public int getlevel(){
		return this.level;
	}
	public void sethp(int hp){
		this.helthpoint = hp;
	}
	public int gethp(){
		return this.helthpoint;
	}
	
}