// Creating our Thread class by extending Thread class


class MyThread extends Thread{

	MyThread(){

	}

	MyThread(String threadName){
		super(threadName);                       // Initialize thread.
		System.out.println(this);
	    start();
	}

	public void run(){
		//Display info about this particular thread
		System.out.println(Thread.currentThread().getName());
	}
}

public class ThreadExample{
	public static void main(String[] args){

//      rename "Thread-0" and "Thread-1" to
//      "myThread1" and "myThread2" respectively
	    Thread thread1 =  new Thread(new MyThread(),"myThread1");
	    Thread thread2 =  new Thread(new MyThread(),"myThread2");

//	    The below 2 threads are assigned default names
	    Thread thread3 =  new MyThread();
	    Thread thread4 =  new MyThread();

	    Thread thread5 = new MyThread("myThread5");

//Start the threads
	    thread1.start();
	    thread2.start();
	    thread3.start();
	    thread4.start();

	    try{
//The sleep() method is invoked on the main thread to cause a one second delay.
	      Thread.currentThread().sleep(1000);
	    }catch(InterruptedException e){}

	    //Display info about the main thread
	    System.out.println(Thread.currentThread());

	}
}


