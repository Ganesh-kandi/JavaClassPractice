package secondproject;

abstract class demo24{
	public void demo13() {
		System.out.println("inside demo24...");
	}
	abstract void demo14();
}
class demo25 extends demo24{
	public void demo14() {
		System.out.println("inside demo25..");
	}
}

public class LaunchAbstract {

	public static void main(String[] args) {
		//demo24.demo13();  //we can create reference of abstract class...
		demo24 d25=new demo25();
		d25.demo14();

	}

}
