package enumExample;

public class Game {

	public static void main(String[] args) {
		play(Action.LIFT);
		play(Action.STOP);

	}
	
	public static void play(Action act) {
		switch(act) {
			case STOP: //Action STOP
				System.out.println("���U");
				break;
			case RIGHT: //Action RIGHT
				System.out.println("���k");
				break;
			case LIFT: //Action LIFT
				System.out.println("����");
				break;
			case UP: //Action UP
				System.out.println("���e");
				break;
			case DOWN: //Action DOWN
				System.out.println("����");
				break;
		}
	}

}

