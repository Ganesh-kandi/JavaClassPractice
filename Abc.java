package firstProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Abc {

	public static void main(String[] args) {
		
		List<Integer> al=Arrays.asList(2,1,5,4,9,6,5,9,6,48,45,6,9,5);
		///Stream<Integer> str1=al.stream();
		
//		ArrayList<Students> std=new ArrayList();
//		std.add(new Students(21,"ganesh","java"));
//		std.add(new Students(25,"navakanth","Js"));
//		std.add(new Students(23,"lella","java"));
//		std.add(new Students(29,"kandi","phython"));
//		std.add(new Students(30,"gani","c"));
//		
//		//Stream<Students> colg1=std.stream()
//		//colg1.forEach(n->System.out.println(n));
//				std.stream()
//				.filter(n->n.Course.equalsIgnoreCase(("java")))
//				.forEach(n->System.out.println(n));
		
	
		//str1.forEach(a->System.out.println(a));
		Stream<Integer> str1=al.stream();
		Stream<Integer> str2=str1.filter(n->n%2==1);
		Stream<Integer> str3=str2.map(n->n*2);
		int result=str3.reduce(0,(s,e)->s+e);
		System.out.println(result);

	}

}
