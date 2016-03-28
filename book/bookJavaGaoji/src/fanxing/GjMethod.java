package fanxing;

import java.util.ArrayList;
import java.util.List;

public class GjMethod {
	public <T> void displayType(T a){
		System.out.println(a.getClass().getName());
	}
	public <T> T getFirst(List <T> lst){
		return lst.get(0);
	}
	public static void main(String[] args){
		GjMethod gm = new GjMethod();
		List <Integer> lst1=new ArrayList <Integer>();
		lst1.add(1);
		lst1.add(2);
		lst1.add(3);
		Integer i = gm.getFirst(lst1);
		gm.displayType(i);
		gm.displayType(100);
	}
}
