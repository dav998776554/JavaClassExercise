package Role;

public class Swordsman extends Role{
		
	public Swordsman(String Name , int Level , int Helthpoint){
		this.Name = Name;
		setCareer("??�士");
		this.Level = Level;
		this.Helthpoint = Helthpoint;
		//setfight("??��?��??");
	}	
	
	public String toString(){
		//return String.format("??�士 (%s, %d, %d)", this.Name, this.Level, this.Helthpoint);
		return "??�士 " + super.toString();
	}
	
	public String fight(){
		return "?��??��?��??";
	}
	
}