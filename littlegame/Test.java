import java.util.Scanner;
//import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.out;



public class Test{
	public static void main(String[] args){
		ArrayList ar = new ArrayList();
		cNT(ar);
		out.println("訪客名單");
		pUC(ar);
	}
	
	public class ArrayList{
		private Object[] list;
		private int next;
		
		public ArrayList(int cap){
			list = new Object[cap];
		}
		public Arraylist(){
			this(16);
		}
		public void add(Object o){
			if(next == list.length){
				list = Arrays.copyOf(list,list.length*2);
			}
			list[next++] = 0
		}
	}
	
	static void cNT(ArrayList ar){
		Scanner sc = new Scanner(System.in);
		String name;
		while(true){
			out.print("訪客名單:");
			name = sc.nextLine();
			if(name.equals("quit")){
				break;
			}
			ar.add(name);
		}
	}
	
	
	static void pUC(ArrayList ar){
		for(int i = 0; i < ar.size() ; i++){
			String name = (String) ar.get(i);
			out.println(name.toUpperCase());
		}
	}
}