package Role;

public class Magic extends Role implements Scoaer{
	
	public Magic(String Name , int Level , int Helthpoint){
		this.Name = Name;
		setCareer("魔�?�師");
		this.Level = Level;
		this.Helthpoint = Helthpoint;
		//setfight("微弱??��?��?��??");
	}
	
	public String toString(){
		//return String.format("魔�?�師 (%s, %d, %d)", this.Name, this.Level, this.Helthpoint);
		return "魔�?�師 " + super.toString();
	}
	
	public String fight(){
		return "微弱??��?��?��??";
	}
	
	@Override
	public String sco(){
		return "低�?�治??��??";
	}
	
}