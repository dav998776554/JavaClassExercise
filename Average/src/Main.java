
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
		System.out.println("�@�Ǹ귽");
	}
	@Override
	public void close() throws Exception {
		System.out.println("�@�Ǹ귽�Y�N����");
	}
}

class Resourcee implements AutoCloseable{
	void doOther() {
		System.out.println("��L�귽");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("��L�귽�Y�N����");
		
	}
}
