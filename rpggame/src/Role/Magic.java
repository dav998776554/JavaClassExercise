package Role;

public class Magic extends Role implements Scoaer{
	
	public Magic(String Name , int Level , int Helthpoint){
		this.Name = Name;
		setCareer("é­”è?“å¸«");
		this.Level = Level;
		this.Helthpoint = Helthpoint;
		//setfight("å¾®å¼±??„é?”å?›å??");
	}
	
	public String toString(){
		//return String.format("é­”è?“å¸« (%s, %d, %d)", this.Name, this.Level, this.Helthpoint);
		return "é­”è?“å¸« " + super.toString();
	}
	
	public String fight(){
		return "å¾®å¼±??„é?”å?›å??";
	}
	
	@Override
	public String sco(){
		return "ä½Žç?šæ²»??’è??";
	}
	
}