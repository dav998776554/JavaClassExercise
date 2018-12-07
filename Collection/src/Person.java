import java.util.*;
import static java.util.Comparator.*;



public class Person {
	private String firstname;
	private String lastname;
	private Integer zipcode;
	
	
	public Person(String firstname, String lastname, Integer zipcode) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.zipcode = zipcode;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Person(%s,%s,%d)", firstname,lastname,zipcode);
	}
	
	public static void main(String[] args) {
		List person = Arrays.asList(
				new Person("Tom","Hung",166),
				new Person("John","UC",165),
				new Person("Peter","TW",166)
				);
		
		person.sort(
				Comparator.<Person,String>comparing(p -> p.lastname)
				.thenComparing(p -> p.firstname)
				.thenComparing(p -> p.zipcode)
				);
		
		System.out.println(person);
	}
	
	
	
	
}
