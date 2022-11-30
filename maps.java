package firstProject;


import java.util.*;


import java.io.*;

public class maps {

	public static void main(String[] args) {
		ArrayList<Students> num=new ArrayList<>();
//		num.add(10);
//		num.add(2);
//		num.add(8);
//		num.add(1);
//		num.add(6);
		num.add(new Students(45, "ravi", "java"));
		num.add(new Students(22, "ganesh", "aws"));
		num.add(new Students(26, "kandi", "js"));
		num.add(new Students(21, "anu", "phython"));
		Comparator<Students> com =(s1, s2)-> s1.age-s2.age;
			
		
		System.out.println(num);
		Collections.sort(num, com);
		System.out.println(num);
		
	}

}
// class Comaparatorimp implements Comparator<Students>{
//	 @Override
//	public int comapre(Students s1, Students s2) {
//		return s1.age-s2.age;
//	}
//
//	@Override
//	public int compare(Students o1, Students o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//}

