import java.util.ArrayList;

public class Lexical_search {
    public static void main(String[] args) {
        String [] names = {
            "RANVEER SINGH","RAJKUMAR","YASH","ALLU ARJUN","SHAH RUKH KHAN"
        };
        String search="RA";
        ArrayList<String> result = new ArrayList<>();
        for(String name : names){
            if (name.contains(search)) {
                result.add(name);
            }
        }
        System.out.println("Search results : ");
        for(String name : result){
            System.out.println(name);
        }
    }
}
