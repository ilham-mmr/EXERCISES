public class Payroll{
    private double netPay;
    public void calculateNetPay(Employee employee){
        netPay = employee.getGrossPay()-employee.getStateTax()-employee.getFederalTax();
    }

    public void printOutput(){
        System.out.println("Net pay is: RM "+netPay);
    }
}
