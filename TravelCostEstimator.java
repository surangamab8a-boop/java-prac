import java.util.Scanner;

public class TravelCostEstimator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distance = input.nextDouble();
        double fuelEfficiency = input.nextDouble();
        double fuelPrice = input.nextDouble();

        double fuelUsed = distance / fuelEfficiency;
        double totalCost = fuelUsed * fuelPrice;

        System.out.println("Travel Cost: " + totalCost);
    }
}
