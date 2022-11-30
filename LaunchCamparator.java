package secondproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class student implements Comparable<student>{
	
	int sId;
	String sName;
	int age;
	
	public student(int sId, String sName, int age) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.age = age;
	}
	public String toString() {
		return "Name:"+ sName + " Student ID:" + sId +" Age:"+ age;
		
	}
	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
//	class comparatorImpl implements Comparator<student>{
//
//		@Override
//		public int compare(student s1,student s2);
//	}
	
public class LaunchCamparator {

	public static void main(String[] args) {
		ArrayList<student> al=new ArrayList<>();
		al.add(new student(123, "Ganesh", 30));
		al.add(new student(156, "Navakanth", 23));
		al.add(new student(145, "Mohith", 29));
		al.add(new student(178, "Leela", 25));
		
		//Comparator<student> com=(s1,s2)->s1.sName.compareTo(s2.sName);
		Collections.sort(al, (s1,s2)->s1.sName.compareTo(s2.sName));
		System.out.println(al);
	}

}
