import java.util.*;

class Account2 implements Comparable<Account2>{
	private String name;
	private String number;
	private int balance;
	
	Account2(String name, String number, int balance) {
		this.name = name;
		this.number = number;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return String.format("Account2(%s, %s, %d)",
				name,number,balance);
	}

	@Override
	public int compareTo(Account2 other) {
		return this.balance - other.balance;
	}
}

public class Sort3 {

	public static void main(String[] args) {
		List<Account2> accs = Arrays.asList(
				new Account2("Justion","X12345",1000),
				new Account2("John","A12345",2000),
				new Account2("BackHan","B12345",1500)
				); 
		Collections.sort(accs);
		System.out.println(accs);
	}

}
