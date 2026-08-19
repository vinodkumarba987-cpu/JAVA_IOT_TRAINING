public class multi_thread extends Thread{
    public void run(){
        for (int i = 0; i < 5;i++) {
            System.out.println("Method"+i);
        }
    }
    public static void main(String[] args) {
        multi_thread aa=new multi_thread();
        aa.start();
        for (int i = 0; i < 5;i++) {
            System.out.println("main method"+i);
    }
}
}
