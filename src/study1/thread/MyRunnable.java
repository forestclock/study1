package study1.thread;

/**
 * 
 * @ClassName MyThread2
 * @Description 实现Runnable接口，并重写该接口的run()方法，
 * 				该run()方法同样是线程执行体，创建Runnable实现类的实例，
 * 				并以此实例作为Thread类的target来创建Thread对象，该Thread对象才是真正的线程对象。
 * @author zhong
 * @date 2017年4月10日下午9:29:28
 *
 */
public class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		
		System.out.println("Runnable----------");
		for(int i = 0;i < 100;i++){
			System.out.println(Thread.currentThread().getName() + "    " + i);
		}
	}

}
