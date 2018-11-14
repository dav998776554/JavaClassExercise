package Role;

public class Swordsman extends Role{
		
	public Swordsman(String Name , int Level , int Helthpoint){
		this.Name = Name;
		setCareer("??å£«");
		this.Level = Level;
		this.Helthpoint = Helthpoint;
		//setfight("??“ç?†ä??");
	}	
	
	public String toString(){
		//return String.format("??å£« (%s, %d, %d)", this.Name, this.Level, this.Helthpoint);
		return "??å£« " + super.toString();
	}
	
	public String fight(){
		return "?‹±??‡æ?“æ??";
	}
	
}