public class Demo{
	public static void main(String[] args){
		Test t1 = new Test();
		Test.Test2 t2 = t1.new Test2();
		
		t2.Other();
	}
}