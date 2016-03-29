package fanxing;

import java.util.ArrayList;
import java.util.List;

/*
 * 文件名：Test2
 * 本章章末上机习题第二题，要求定义两个静态方法
 * printElement用于输出元素类型是Number的List元素
 * addElement用于向List表中添加Number及其子类元素
 */

public class Test2 {
	public void printElement(List<Number> lst){
		for (Number number : lst) {
			System.out.println(number);
		}
	}
	public void addElement(List<? super Number> lst,Number e){
		lst.add(e);
	}
	public static void main(String[] args){
		List<Number> lst= new ArrayList<Number>();
		Test2 ts = new Test2();
		ts.addElement(lst, 12);
		ts.addElement(lst, 32.5);
		ts.printElement(lst);
	}
}
