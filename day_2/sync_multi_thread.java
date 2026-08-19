

class Bank{
    synchronized void withdraw(int amount){
        System.out.println("Withdrawing : "+amount);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        System.out.println(e);
        }
        System.out.println("Withdraw completed !");
    }
}
class MyThread extends Thread{
    Bank bank;
    MyThread(Bank bank) {
        this.bank=bank;
    }
    public void run(){
        bank.withdraw(2000);
    }  
}
public class sync_multi_thread {
    public static void main(String[] args) {
        Bank bank =new Bank();
        MyThread t1=new MyThread(bank);
        MyThread t2 =new MyThread(bank);
        t1.start();
        t2.start();
    }
}
