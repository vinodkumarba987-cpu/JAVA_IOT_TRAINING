public class maximum {

    public static void main(String[] args) {
        int[] salary = { 25000, 40000, 30000, 50000 };

        int maxSalary = salary[0];

        for (int i = 1; i < salary.length; i++) {
            if (salary[i] > maxSalary) {
                maxSalary = salary[i];
            }
        }

        System.out.println("Maximum Salary : " + maxSalary);
    }
}