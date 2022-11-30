package firstProject;

import java.util.*;


public class Main {

	public static void main(String[] args) {
//		TreeSet ts= new TreeSet();
//		ts.add(10);
//		ts.add(20);
//		ts.add(124);
//		ts.add(324);
//		ts.add(90);
//		ts.add(43);
//		ts.add(87);
		List al=new LinkedList();
		al.add("ganesh");
		al.add(12);
		al.add("abc");
		al.add(345);
		al.add("sri");
		al.add("kandi");
		
		System.out.println(al);
		ListIterator li=al.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());

		}
		System.out.println("****************************************");

		while(li.hasPrevious()){
			System.out.println(li.previous());
		}

}
}
