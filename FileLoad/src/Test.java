
public class Test {

	public static void main(String[] args) {
		try {
			c();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	static void c() {
		try {
			b();
		} catch (NullPointerException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
			Throwable t = ex.fillInStackTrace();
			throw(NullPointerException)t;
		}
	}
	static void b() {
		a();
	}
	static String a() {
		String text = null;
		return text.toUpperCase();
	}

}
