package thread;
/*
 * 文件名：ThreadDemo.java
 *继承Thread类创建线程实例。实现倒计时功能
 */

class NewThread extends Thread{
	NewThread(String name){
		super(name);
	}
	public void run(){
		for(int i = 10;i>0;i--){
			System.out.println("还有"+i+"秒钟");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("游戏结束");
	}
}
public class ThreadDemo1 {
	public static void main(String[] args){
		NewThread nt = new NewThread("ThreadDemo");
		nt.start();
	}
}
