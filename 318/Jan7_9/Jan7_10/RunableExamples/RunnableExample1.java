//Creating our Thread class by implementing Runnable interface

class RunnableThread implements Runnable{

	Thread runner;
	public RunnableThread() {
	}

	public RunnableThread(String threadName) {
        runner = new Thread(this, threadName);   // (1) Create a new thread.
        System.out.println(runner.getName());
        runner.start();                          // (2) Start the thread.
	}

	public void run(){
		//Display info about this particular thread
		System.out.println(Thread.currentThread());
	}


}

public class RunnableExample1{

	public static void main(String[] args){

	    Thread thread1 =  new Thread(new RunnableThread(),"thread1");
	    Thread thread2 =  new Thread(new RunnableThread(),"thread2");
	    RunnableThread thread3 = new RunnableThread("thread3");

//Start the threads
	    thread1.start();
	    thread2.start();
	    try{
	      //delay for one second
	      Thread.currentThread().sleep(1000);
	    }catch(InterruptedException e){}

	    //Display info about the main thread
	    System.out.println(Thread.currentThread());

/*Output could be:
thread3
Thread[thread3,5,main]
Thread[thread1,5,main]
Thread[thread2,5,main]
Thread[main,5,main]
-------------------------------
thread3
Thread[thread2,5,main]
Thread[thread3,5,main]
Thread[thread1,5,main]
Thread[main,5,main]
------------------------------
thread3
Thread[thread3,5,main]
Thread[thread2,5,main]
Thread[thread1,5,main]
Thread[main,5,main]

 etc.


*/


	}
}