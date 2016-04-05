package thread;
/*
 * 文件名：MyStack.java
 * 描述一个堆栈，包括压栈和出栈两个方法，在访问时有可能造成共享数据不一致
 */
public class MyStack {
	int top = -1;
	char [] data = new char[128];
	public void push (char element){
		top++;
		data[top] = element;
	}
	public char pop(){
		char element = data[top];
		top--;
		return element;
	}
}
