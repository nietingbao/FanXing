package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SeriTest {
	public static void main(String[] args){
		
		try {
			//构造FileOutputStream对象
			FileOutputStream f = new FileOutputStream("E:\\example\\customer.txt");
			//构造ObejectOutputStream对象
			ObjectOutputStream o = new ObjectOutputStream(f);
			Customer cs = new Customer("xiaobao", 20);
			//使用ObjectOutputStream对象的writeObject()方法进行序列化
			o.writeObject(cs);
			//关闭ObjectOutputStream对象
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
