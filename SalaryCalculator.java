import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double basicSalary = input.nextDouble();
        double hra = input.nextDouble();
        double da = input.nextDouble();

        double totalSalary = basicSalary + hra + da;

        System.out.println("Total Salary: " + totalSalary);
    }
}
