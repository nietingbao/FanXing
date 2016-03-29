package serialization;
/*
 * 文件名：Customer.java
 * 建一个实现Serializable接口的Customer类
 */
import java.io.Serializable;

public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public Customer(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return "name ="+name+",age="+age;
	}
}
