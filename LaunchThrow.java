package secondproject;

import java.util.Scanner;
class demo2 extends Exception{
	static String str="enter non zero second number";
	demo2(){
		super(str);
	}
	
}
class Demo1{
	Scanner sc=new Scanner(System.in); 
		public void add1() throws demo2 {
			try {
				int a= sc.nextInt();
				int b=sc.nextInt();
				
//				if(b==0) 
//				{
//				throw new demo2();				
//				}
//				else {
//					System.out.println("code is running");
//				}
				
				int c=a/b;
				System.out.println("answer is: "+c);
				throw new demo2();
			}
			catch(demo2 e){
				throw e;
			}
				
			
		}
}
public class LaunchThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
