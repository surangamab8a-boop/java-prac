import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double subject1 = input.nextDouble();
        double subject2 = input.nextDouble();
        double subject3 = input.nextDouble();

        double average = (subject1 + subject2 + subject3) / 3;

        System.out.println("Average Marks: " + average);
    }
}
