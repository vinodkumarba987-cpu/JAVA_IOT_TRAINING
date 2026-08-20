public class TotalSalaryCalculator {
    public static void main(String[] args) {
        int[] salaries = {10000, 15000, 12000, 18000, 20000};
        int totalSalary = 0;
        for (int salary : salaries) {
            if (salary < 0) {
                System.out.println("Invalid salary detected: " + salary);
                return;
            }
            totalSalary += salary;
        }
        System.out.println("Total salary of all employees: " + totalSalary);
    }
}
