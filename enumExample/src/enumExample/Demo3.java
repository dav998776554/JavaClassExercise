package enumExample;

public class Demo3 {

	public static void main(String[] args) {
		Demo3.play(Action3.RIGHT);
		Demo3.play(Action3.LIFT);
	}

	static void play(Action3 act3) {
		act3.execute();
	}
}
