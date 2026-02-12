import java.util.Scanner;

public class average {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first = number.nextDouble();
        System.out.print("Enter second number: ");
        double second = number.nextDouble();
        System.out.print("Enter third number: ");
        double third = number.nextDouble();
        double average = (first + second + third) / 3;
        System.out.println(average);
    }
}