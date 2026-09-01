public class Jump_Game {

    public static void main(String[] args) {

        int[] a = {2, 3, 1, 1, 4};
        int maxreach=0;
        for(int i =0;i<a.length;i++){
            if (i>maxreach) {
                break;
            }
        }
        if (maxreach>=a.length-1) {
            System.out.println("Can reach the last Position !");
        }else{
            System.out.println("Cannot reach the last Position !");
        }

    }
}