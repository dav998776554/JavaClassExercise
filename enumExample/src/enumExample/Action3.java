package enumExample;

import static java.lang.System.out;;

public enum Action3 implements Command {
	STOP{
		public void execute() {
			out.println("����");
		}
	}, 
	RIGHT{
		public void execute() {
			out.println("���k");
		}
	},  LIFT{
		public void execute() {
			out.println("����");
		}
	},UP{
		public void execute() {
			out.println("���W");
		}
	},DOWN{
		public void execute() {
			out.println("���U");
		}
	};
/*public void execute() {
	switch(this) {
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
	}*/
}