package firstProject;

import java.util.ArrayList;

public class Students {
	int age;
	String name;
	String Course;
	public Students(int age, String name, String Course) {
		super();
		this.age = age;
		this.name = name;
		this.Course = Course;
	}@Override
	public String toString() {
		return "age: " +age +"|| name: "+ name+ "|| course: "+Course;
	}
}
