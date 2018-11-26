package enumExample;

public class Game {

	public static void main(String[] args) {
		play(Action.LIFT);
		play(Action.STOP);

	}
	
	public static void play(Action act) {
		switch(act) {
			case STOP: //Action STOP
				System.out.println("停下");
				break;
			case RIGHT: //Action RIGHT
				System.out.println("往右");
				break;
			case LIFT: //Action LIFT
				System.out.println("往左");
				break;
			case UP: //Action UP
				System.out.println("往前");
				break;
			case DOWN: //Action DOWN
				System.out.println("往後");
				break;
		}
	}

}

