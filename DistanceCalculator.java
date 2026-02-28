import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distanceFromToVia = input.nextDouble();
        double distanceViaToFinalCity = input.nextDouble();

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;

        System.out.println("Total Distance: " + totalDistance);
    }
}
