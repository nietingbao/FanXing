package thread;
/*
 * 文件名：MyStack.java
 * 修改后的堆栈类，在push和pop两个方法上用synchronized(this)的方法加锁
 */
public class MyStack1 {
	int top = -1;
	char [] data = new char[128];
	public void push(char element){
		synchronized (this) {
			top++;
			data[top]=element;
		}
		//synchronized执行完之后解锁
	}
	public char pop(){
		char element;
		element = data[top];
		top--;
		return element;
	}
}
