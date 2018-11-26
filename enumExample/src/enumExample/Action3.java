package enumExample;

import static java.lang.System.out;;

public enum Action3 implements Command {
	STOP{
		public void execute() {
			out.println("停止");
		}
	}, 
	RIGHT{
		public void execute() {
			out.println("往右");
		}
	},  LIFT{
		public void execute() {
			out.println("往左");
		}
	},UP{
		public void execute() {
			out.println("往上");
		}
	},DOWN{
		public void execute() {
			out.println("往下");
		}
	};
/*public void execute() {
	switch(this) {
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
	}*/
}