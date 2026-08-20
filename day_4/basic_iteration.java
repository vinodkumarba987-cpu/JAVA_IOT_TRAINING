public class basic_iteration{
    public static void main(String[] args) {
        int n=10000;
        int [] stud =new int[n];
        for (int i = 0; i < n; i++) {
           // Object elem = arr[i];
           stud[i]=i+1;
        }
        int targ=1000;
        boolean found =false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (stud[j]==targ) {
                    found=true;
                    break;
                }
            }
            if (found){
                break;
            }
        }
        System.out.println("Student Found :" +found);
    }
}