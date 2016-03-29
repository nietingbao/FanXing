package fanxing;

import java.util.ArrayList;
import java.util.List;

/*
 * 文件名：ListSum.java
 * 求存储着Number及其子类对象的List表中元素之和
 */
public class ListSum {
	public double sumOfList(List<? extends Number> lst){
		double s = 0;
		for (Number number : lst) {
			s=s+number.doubleValue();
		}
		return s;
	}
	public static void main(String[] args){
		List <Number> lst1= new ArrayList<Number>();
		lst1.add(1.23);
		lst1.add(100);
		lst1.add(new Byte("5"));
		ListSum ls = new ListSum();
		System.out.println("表中数据的和为"+ls.sumOfList(lst1));
		
	}
	
}
