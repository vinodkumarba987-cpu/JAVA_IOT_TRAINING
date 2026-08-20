public class ElectricityConsumption {
    public static void main(String[] args) {
        int[] units = {10, 15, 12, 20, 18, 14, 16};
        int total = 0;
        for (int unit : units) {
            total += unit;
        }
        System.out.println("Total electricity consumption for 7 days: " + total + " units");
    }
}
