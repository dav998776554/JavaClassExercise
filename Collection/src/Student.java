import java.util.*;


public class Student {
	
	private String name;
	private String number;
	public Student(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	@Override
	public int hashCode() {
		int hash = 5;
		hash = 47 * hash + Objects.hashCode(this.name);
		hash = 47 * hash + Objects.hashCode(this.number);
		return hash;
	}
	
	@Override
	public String toString() {
		return String.format("(%s,%s)",name,number);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		final Student other  = (Student) obj;
		if(!Objects.equals(this.name, other.name)) {
			return false;
		}
		if(!Objects.equals(this.number, other.number)) {
			return false;
		}
		return true;
	}
	
}
