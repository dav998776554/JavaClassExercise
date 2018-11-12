public class Play{
	public static void main(String[] args){
		Swordman s1 = new Swordman("john",1,100);
		System.out.printf("名稱:%s \n等級:%d \n血量:%d",s1.getname(),s1.getlevel(),s1.gethp());
	}
}