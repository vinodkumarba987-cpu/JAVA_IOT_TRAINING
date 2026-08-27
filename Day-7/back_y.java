public class back_y{

    static String correctReligion = "Hindu";

    static boolean choose(String religion, boolean rich) {

        System.out.println("Trying: " + religion + ", Rich: " + rich);
        if (religion.equals(correctReligion) && !rich) {
            System.out.println("Choice 1 selected");
            return true;
        }

        if (!religion.equals(correctReligion) && rich) {
            System.out.println("Choice 2 selected");
            return true;
        }

        if (religion.equals(correctReligion) && rich) {
            System.out.println("Choice 3 selected");
            return true;
        }
   /*    if(!religion.equals(correctReligion) &&!rich) {
            System.out.println("Choice 3 selected");
            return true;
        }*/

        System.out.println("Backtracking...");
        return false;
    }

    public static void main(String[] args) {

        String[] religions = {"Christian", "Muslim", "Hindu"};
        boolean[] money = {false, true};

        for (String religion : religions) {
            for (boolean rich : money) {

                if (choose(religion, rich)) {
                    System.out.println("Choice found!");
                    return;
                }
            }
        }
    }
}