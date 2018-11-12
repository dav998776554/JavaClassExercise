package Role;

public class Swordsman extends Role{
		
	public Swordsman(String Name , int Level , int Helthpoint){
		this.Name = Name;
		setCareer("劍士");
		this.Level = Level;
		this.Helthpoint = Helthpoint;
		//setfight("打爆他");
	}	
	
	public String toString(){
		//return String.format("劍士 (%s, %d, %d)", this.Name, this.Level, this.Helthpoint);
		return "劍士 " + super.toString();
	}
	
	public String fight(){
		return "英勇打擊";
	}
	
}