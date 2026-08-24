
//import java.util.*

public class rabin_carppp {
    public static void main(String[] args) {
        String text = "I love  Java Programming ";
        String pattern = "Java";
        int position = search(text,pattern);
        if  (position !=-1){
            System.out.println("Pattern found at index : "+position);
        }else{
            System.out.println("Pattern not found");
        }
    }
    static int search(String text,String pattern){
        int n =text.length();
        int m =pattern.length();
        int patternHash=getHash(pattern);
        for (int i =0; i <= n-m; i++) {
            String part =text.substring(i, i+m);
            int partHash=getHash(part);
            if (patternHash==partHash){
                if(part.equals(pattern)){
                    return i;
                }
            }
            
        }
        return -1;
    }
    static int getHash(String str){
        int hash =0;
        for (int i = 0; i < str.length(); i++) {
            hash =hash+str.charAt(i); 
        }
        return hash;
    }
}

