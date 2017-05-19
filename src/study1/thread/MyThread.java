package study1.thread;
/**
 * 
 * @ClassName MyThread 
 * @Description 多线程创建、启动方式之一  继承Thread类，然后重写该类的run()方法
 * @author zhong
 * @date 2017年4月10日下午9:18:43
 *
 */
public class MyThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		super.run();
		for(int i =0;i < 100;i++){
			System.out.println(Thread.currentThread().getName() + "    " + i);
		}
	}
}
