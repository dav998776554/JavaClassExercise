package enumExample;

public class Demo2 {

	public static void main(String[] args) {
		Demo2.play(Action.LIFT.ordinal());
	}
	
	public static void play(int i) {
		switch(i) {
			case 0: //Action STOP
				System.out.println("���U");
				break;
			case 1: //Action RIGHT
				System.out.println("���k");
				break;
			case 2: //Action LIFT
				System.out.println("����");
				break;
			case 3: //Action UP
				System.out.println("���e");
				break;
			case 4: //Action DOWN
				System.out.println("����");
				break;
		}
	}
}