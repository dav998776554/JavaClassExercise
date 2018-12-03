import java.util.*;

interface Request{
	void execute();
}

public class RequestQueu {

	public static void main(String[] args) {
		Queue<Request> requests = new LinkedList<>();
		offerRequestTo(requests);
		process(requests);
	}

	static void offerRequestTo(Queue<Request> requests) {
		for(int i = 1;i<6;i++) {
			requests.offer(
					() -> System.out.printf("處理資料 %f%n", Math.random())
					);
		}
	}
	
	static void process (Queue<Request> requests) {
		while(requests.peek()!=null) {
			Request request = requests.poll();
			request.execute();
		}
	}
}
