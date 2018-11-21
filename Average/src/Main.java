
public class Main {

	public static void main(String[] args) {

		try(Resourcee ree = new Resourcee();
			Resource res = new Resource()) {
			res.doSome();
			ree.doOther();}catch (Exception e) {
			e.printStackTrace();
		}
	}

}


class Resource implements AutoCloseable{
	void doSome() {
		System.out.println("一些資源");
	}
	@Override
	public void close() throws Exception {
		System.out.println("一些資源即將關閉");
	}
}

class Resourcee implements AutoCloseable{
	void doOther() {
		System.out.println("其他資源");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("其他資源即將關閉");
		
	}
}
