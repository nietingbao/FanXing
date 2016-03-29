package fanxing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//姓名比较器
class NameComparator implements Comparator<Student>{
	public int  compare(Student s1,Student s2){
		return s1.name.compareTo(s2.name);
	}
}
//年龄比较器
class AgeComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		return s1.age-s2.age;
	}
}

public class ComparatorDemo {
	public static void main(String[] args){
		Student s1=new Student("xiaobao",19);
		Student s2=new Student("huoshen",20);
		Student s3=new Student("xiaojin",20);
		Student s4=new Student("qiangzi",21);
		ArrayList<Student> lst=new ArrayList<Student>();
		lst.add(s4);
		lst.add(s3);
		lst.add(s2);
		lst.add(s1);
		NameComparator nc = new NameComparator();
		Collections.sort(lst, nc);
		System.out.println("按姓名排序");
		for (Student student : lst) {
			student.printInfo();
		}
		AgeComparator ac = new AgeComparator();
		Collections.sort(lst,ac);
		System.out.println("按年龄排序");
		for (Student student : lst) {
			student.printInfo();
		}
	}
}
