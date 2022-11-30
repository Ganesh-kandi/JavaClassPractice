package secondproject;
interface Alfa12{
	public void add();
}

interface beta12 extends Alfa12{
	public void sum();
	//public void add();
	
}
class ghama implements beta12{
	public void sum() {
		System.out.println("sum method is excuted......");
	}
	public void add() {
		System.out.println("add method....");
	}
}

class LaunchLambda extends ghama{

	
	public static void main(String[] args) {
		Alfa12 a=()-> System.out.println("adding in lambda.....");
		a.add();
		beta12 g=new ghama();
		g.sum();
		g.add();
		
	}

//	@Override
//	public void add() {
//		// TODO Auto-generated method stub
//		
//	}

}
