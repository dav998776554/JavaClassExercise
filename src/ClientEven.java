public class ClientEven{
	private Client client;
	public ClientEven(Client client){
		this.client = client;
	}
	public String getName(){
		return client.name;
	}
	public String getIP(){
		return client.ip;
	}
}