
public class Main {

	public static void main(String[] args) {
		try(Resource res = new Resource()) {
			res.doSome();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


class Resource implements AutoCloseable{
	void doSome() {
		System.out.println("�귽����");
	}
	@Override
	public void close() throws Exception {
		System.out.println("�귽�Y�N����");
	}
}