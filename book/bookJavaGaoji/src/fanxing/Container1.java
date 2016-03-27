package fanxing;

public class Container1 <T>{
	private T elem;
	public Container1(T elem){
		this.elem=elem;
	}
	public T get(){
		return this.elem;
	}
	public void set(T elem){
		this.elem=elem;
	}
	public static void main(String[] args){
		Container1<Person>  c1=new Container1<Person>(new Person("xiaobao"));
		Person s1=c1.get();
		System.out.println(s1);
	}
}

