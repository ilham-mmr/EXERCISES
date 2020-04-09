
import java.util.Scanner;

public class Employee{
    private Scanner scanner;
   private String employeeId;
   private double grossPay;
    private  double stateTax;
    private double federalTax;

    public void input(){
        scanner = new Scanner(System.in);
        System.out.print("Enter your employee ID number: ");
        employeeId = scanner.nextLine();
        System.out.print("Enter your gross pay : RM");
        grossPay = scanner.nextDouble();
        System.out.print("Enter your state tax: RM ");
        stateTax = scanner.nextDouble();
        System.out.print("Enter your federal tax: RM ");
        federalTax = scanner.nextDouble();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getStateTax() {
        return stateTax;
    }

    public double getFederalTax() {
        return federalTax;
    }
}
