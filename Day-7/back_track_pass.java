public class back_track_pass{

    static String correctPassword = "123";

    static boolean check(String attempt) {

        System.out.println("Trying: " + attempt);

        if (attempt.equals(correctPassword)) {
            System.out.println("Correct Password!");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String[] attempts = {"111", "121", "122", "123"};

        for (String attempt : attempts) {

            if (check(attempt)) {
                break;
            }
        }
    }
}