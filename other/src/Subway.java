public class Subway extends Boat implements Drive{
	public Subway(String name){
		super(name);
	}
	
	@Override
	public void drive(){
		System.out.printf("潛艇堡 %s 深海潛行%n",this.name);
	}
}