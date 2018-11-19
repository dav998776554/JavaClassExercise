
public class Main {

	public static void main(String[] args) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 751c1bb81d3ecf29358d7362e4846397519e7322
		try(Resourcee ree = new Resourcee();
			Resource res = new Resource()) {
			res.doSome();
			ree.doOther();
<<<<<<< HEAD
=======
=======
		try(Resource res = new Resource()) {
			res.doSome();
>>>>>>> 4217a3e81efefb1c89cac82d844628ee42816426
>>>>>>> 751c1bb81d3ecf29358d7362e4846397519e7322
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


class Resource implements AutoCloseable{
	void doSome() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 751c1bb81d3ecf29358d7362e4846397519e7322
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
	
<<<<<<< HEAD
=======
=======
		System.out.println("資源關閉");
	}
	@Override
	public void close() throws Exception {
		System.out.println("資源即將關閉");
	}
>>>>>>> 4217a3e81efefb1c89cac82d844628ee42816426
>>>>>>> 751c1bb81d3ecf29358d7362e4846397519e7322
}