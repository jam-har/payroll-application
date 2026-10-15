import java.util.Arrays;
import java.util.Scanner;
public class PayrollApp {

    public static void main(String[] args) {

        Scanner empScanner = new Scanner(System.in);

        System.out.println("Enter your name.");
        String name = empScanner.nextLine();

        System.out.println("Enter your hours worked.");
        Float hoursWorked = empScanner.nextFloat();

        System.out.println("Enter your hourly pay rate.");
        Float hourlyPay = empScanner.nextFloat();

        Float grossPay = hoursWorked * hourlyPay;

        System.out.println("Hello " + name + "! Your gross pay for this period is $" + grossPay + ".");


    }
}
