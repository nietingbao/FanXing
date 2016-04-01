package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSers {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		// TODO Auto-generated method stub
		serialize("E://example//ah.txt");
		deserialize("E://example//ah.txt");
	}
	public static void serialize(String fileName) throws IOException{
		FileOutputStream f = new FileOutputStream(fileName);
		ObjectOutputStream o = new ObjectOutputStream(f);
		Customer cs= new Customer("小宝",20);
		o.writeObject(cs);
		o.writeObject("下面这个人很帅");
		o.writeObject("而且很年轻，他的年龄是：");
		o.close();
		f.close();
	}
	public static void deserialize(String fileName)throws IOException,ClassNotFoundException{
		FileInputStream f = new FileInputStream(fileName);
		ObjectInputStream in = new ObjectInputStream(f);
		Customer cs = (Customer)in.readObject();
		System.out.println((String)in.readObject());
		System.out.println(cs.getName());
		System.out.println((String)in.readObject());
		System.out.println(cs.getAge());
		in.close();
		f.close();
		
	}

}
