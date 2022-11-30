package secondproject;

interface demo21{
	public void demo11();	
}
class demo22 implements demo21{
	public void demo11() {
		System.out.println("inside demo22");
	}
}
class demo23 implements demo21{
	public void demo11() {
		System.out.println("inside demo23...");
	}
}
public class LaunchInter {

	public static void main(String[] args) {
		demo21 d22=new demo22();
		d22.demo11();
		demo21 d23=new demo23();
		d23.demo11();
	}

}
