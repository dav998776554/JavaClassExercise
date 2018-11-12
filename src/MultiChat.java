public class MultiChat{
	public static void main(String[] args){
		Client c1 = new Client("127.0.0.1","Peter");
		Client c2 = new Client("192.168.0.2","John");
		
		ClientQueue queue = new ClientQueue();
		
		queue.addClientListener(new ClientListener){
			@Override
			public void clientAdded(ClientEven even){
				System.out.printf("%s 從 %s 連線%n",even.getName(),even.getIP());
			}
			@Override
			public void clientRemoved(ClientEven even){
				System.out.printf("%s 從 %s 離線%n",even.getName(),even.getIP());
			}
		}
		
		queue.add(c1);
		queue.add(c2);
		
		queue.remove(c1);
		queue.remove(c2);
	}
}