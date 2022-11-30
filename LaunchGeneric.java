package secondproject;

class Gen<T>
{
	T obj;
	Gen(T obj){
		this.obj=obj;
	}
	public void show() {
		System.out.println("this is the object type is : "+ obj.getClass().getName());
	}
	public T getobj() {
		return obj;
	}
}

public class LaunchGeneric {

	public static void main(String[] args) {
		Gen<String> g=new Gen<String>("10");
		Gen<Integer>g1=new Gen<Integer>(76);
		g.show();
		System.out.println(g.getobj());
		g1.show();
		System.out.println(g1.getobj());
		
	}

}
