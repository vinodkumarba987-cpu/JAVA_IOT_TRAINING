public class array_two_pointers {
    public static void main(String[] args) {
        int [] num ={10,20,30,40,50};
        int target =80;
        int left =0;
        int right = num.length-1;
        while (true) { 
            int sum =num[left]+num[right];
            if (sum==target) {
                System.out.println("Numbers found : "+num[left]+" and "+num[right]);
                break;
            } else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
    }
}