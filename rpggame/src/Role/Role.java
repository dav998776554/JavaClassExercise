package Role;

public abstract class Role implements Fighter{
	protected String Name;
	private String Career;
	protected int Level;
	protected int Helthpoint;
	//private String fight;
	
	public abstract String fight();
	
	public String toString(){
		return String.format("%s,%d,%d",this.Name,this.Level,this.Helthpoint);
	}
	
	public void setName(String Name){
		this.Name = Name;
	}
	public String getName(){
		return this.Name;
	}
	public void setCareer(String Career){
		this.Career = Career;
	}
	public String getCareer(){
		return this.Career;
	}
	/*public void setfight(String fight){
		this.fight = fight;
	}
	public String getfight(){
		return this.fight;
	}*/
	public void setLevel(int Level){
		this.Level += Level;
	}
	public int getLevel(){
		return Level;
	}
	public void sethp(int Helthpoint){
		this.Helthpoint = Helthpoint;
	}
	public int gethp(){
		return this.Helthpoint;
	}
}
