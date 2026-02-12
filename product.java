import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = number.nextInt();
        System.out.print("Enter second number: ");
        int second = number.nextInt();
        System.out.print("Enter thrid number: ");
        int third = number.nextInt();
        int product = first * second * third;
        System.out.println("The product is: " + product);  
    }
}
