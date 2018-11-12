import java.util.ArrayList;

public class ClientQueue{
	private ArrayList clients = new ArrayList();
	private ArrayList listeners = new ArrayList();
	public void addClientListener(ClientListener listener){
		listeners.add(listener);
	}
	public void add(Client client){
		clients.add(client);
		ClientEven even = new ClientEven(client);
		for(int i = 0; i < listeners.size(); i++){
			ClientListener listener = (ClientListener)listeners.get(i);
			listener.clientAdded(even);
		}
	}
	public void remove(Client client){
		clients.remove(client);
		ClientEven even = new ClientEven(client);
		for(int i = 0; i < listeners.size(); i++){
			ClientListener listener = (ClientListener)listeners.get(i);
			listener.clientRemoved(even);
		}
	}
}