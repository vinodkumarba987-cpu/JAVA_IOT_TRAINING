
/*class MyThread extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Thread running: " + i);
         try {
             Thread.sleep(500);
         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }
 }
} */
class MyRunnable implements Runnable {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Runnable running: " + i);
         try {
             Thread.sleep(500);
         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }
 }
}

public class MultiThreadDemo {
 public static void main(String[] args) {
	 
    // MyThread t1 = new MyThread();
   //d  t1.start();
     Thread t2 = new Thread(new MyRunnable());
     t2.start();
     for (int i = 1; i <= 5; i++) {
         System.out.println("Main thread: " + i);
         try {
             Thread.sleep(500);
         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }
 }
}