package fanxing;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	String name;
	int age;
	Student(){
		
	}
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	void printInfo(){
		System.out.println(name+"\t"+age);
	}
	//重写comparable接口中的compareTo方法
	//比较年龄
	public int compareTo(Student a){
		return this.age-a.age;
	}
}
public class ComparableDemo {
	public static void main(String[] args){
		Student s1=new Student("xiaobao",19);
		Student s2=new Student("huoshen",20);
		Student s3=new Student("xiaoqiang",21);
		ArrayList<Student> lst= new ArrayList<Student>();
		lst.add(s3);
		lst.add(s2);
		lst.add(s1);
		Collections.sort(lst);
		for (Student student : lst) {
			student.printInfo();
		}
	}
}
