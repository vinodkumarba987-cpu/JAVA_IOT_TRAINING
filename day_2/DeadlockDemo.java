class ResourceA {
 synchronized void methodA(ResourceB b) {
     System.out.println("Thread 1: Locked ResourceA");
     try { Thread.sleep(1000); } catch (InterruptedException e) {
         System.out.println(e);
     }
     System.out.println("Thread 1: Waiting for ResourceB...");
     b.last();
 }

 synchronized void last() {
     System.out.println("Inside ResourceA.last()");
 }
}

class ResourceB {
 synchronized void methodB(ResourceA a) {
     System.out.println("Thread 2: Locked ResourceB");
     try { Thread.sleep(1000); } catch (InterruptedException e) {
         System.out.println(e);
     }
     System.out.println("Thread 2: Waiting for ResourceA...");
     a.last();
 }

 synchronized void last() {
     System.out.println("Inside ResourceB.last()");
 }
}
public class DeadlockDemo {
 public static void main(String[] args) {
     final ResourceA a = new ResourceA();
     final ResourceB b = new ResourceB();

     // Thread 1 tries to lock ResourceA then ResourceB
     Thread t1 = new Thread(() -> a.methodA(b));

     // Thread 2 tries to lock ResourceB then ResourceA
     Thread t2 = new Thread(() -> b.methodB(a));

     t1.start();
     t2.start();
 }
}