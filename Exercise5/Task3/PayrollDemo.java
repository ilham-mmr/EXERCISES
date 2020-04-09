public class PayrollDemo {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.input();

        Payroll payroll = new Payroll();
        payroll.calculateNetPay(employee);
        payroll.printOutput();

    }
}
