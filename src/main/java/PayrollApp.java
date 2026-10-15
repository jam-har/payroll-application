import java.util.Arrays;
import java.util.Scanner;
public class PayrollApp {

    public static void main(String[] args) {

        Scanner empScanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = empScanner.nextLine();

        System.out.print("Enter your hours worked: ");
        double hoursWorked = empScanner.nextDouble();

        System.out.print("Enter your hourly pay rate: ");
        double hourlyPay = empScanner.nextDouble();

        double grossPay = hoursWorked * hourlyPay;

        System.out.println("Hello " + name + "! Your gross pay for this period is $" + grossPay + ".");

        empScanner.close();


    }
}
