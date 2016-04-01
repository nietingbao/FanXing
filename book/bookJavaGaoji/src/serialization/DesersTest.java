package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesersTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		//构造FileInputStream对象
		FileInputStream f = new FileInputStream("E:\\example\\customer.txt");
		//构造ObjectInputStream对象
		ObjectInputStream in = new ObjectInputStream(f);
		//利用ObjectInuputStream对象的readObject()方法进行反序列化
		Customer cs = (Customer)in.readObject();//读取对象
		System.out.println(cs.getName());
		//关闭ObjectInputStream对象
		in.close();
		//关闭FileInputStream对象
		f.close();
	}
}
