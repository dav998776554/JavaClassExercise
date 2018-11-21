package Staticcc;

public class Demo2 {

	public static void main(String[] args) {
		Node<Apple>apple1 = new Node<>(new Apple(),null);
		Node<Apple>apple2 = new Node<>(new Apple(),apple1);
		Node<Apple>apple3 = new Node<>(new Apple(),apple2);
		Node<Banana>b1 = new Node<>(new Banana(),null);
		Node<Banana>b2 = new Node<>(new Banana(),b1);
		printlnForEach(apple3);
		printlnForEach(b2);
	}

	static void printlnForEach(Node<? extends Fruit>n) {
		Node<? extends Fruit>node = n;
		do {
			System.out.println(node.value);
			node= node.next;
		}while(node != null);
	}
}
