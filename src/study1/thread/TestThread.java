package study1.thread;

public class TestThread {
	
	public static void main(String[] args) {
		/**
		 * 继承Thread类，通过重写run()方法定义了一个新的线程类MyThread，
		 * 其中run()方法的方法体代表了线程需要完成的任务，称之为线程执行体。
		 * 当创建此线程类对象时一个新的线程得以创建，并进入到线程新建状态。
		 * 通过调用线程对象引用的start()方法，使得该线程进入到就绪状态，
		 * 此时此线程并不一定会马上得以执行，这取决于CPU调度时机。
		 */
//		for(int i =0;i < 100;i++){
//			System.out.println(Thread.currentThread().getName() + "    " + i);
//			if(i == 30){
//				MyThread thread = new MyThread();
//				MyThread thread2 = new MyThread();
//				thread.start();
//				thread2.start();
//			}
//		}
		
		
		MyRunnable myRunnable = new MyRunnable();
		//myRunnable.run();
		Thread thread3 = new Thread(myRunnable);
		
		for(int i = 0;i < 100;i++){
			System.out.println("----" + Thread.currentThread().getName() + "----" + i);
			if(i == 30){
				thread3.start();
				try {
					thread3.join();             //main线程需要等待thread3线程完成之后才会继续执行
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
		}
	}

}
