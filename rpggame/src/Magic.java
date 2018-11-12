package Role;

public class Magic extends Role implements Scoaer{
	
	public Magic(String Name , int Level , int Helthpoint){
		this.Name = Name;
		setCareer("魔術師");
		this.Level = Level;
		this.Helthpoint = Helthpoint;
		//setfight("微弱的魔力彈");
	}
	
	public String toString(){
		//return String.format("魔術師 (%s, %d, %d)", this.Name, this.Level, this.Helthpoint);
		return "魔術師 " + super.toString();
	}
	
	public String fight(){
		return "微弱的魔力彈";
	}
	
	@Override
	public String sco(){
		return "低級治癒術";
	}
	
}