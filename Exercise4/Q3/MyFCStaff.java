public class MyFCStaff {
    private String name;
    private String staffID;
    private int totalHoursWork;
    private double totalSale;
    private double commision;
    private double salary;

    public MyFCStaff(String name, String staffID, int totalHoursWork, double totalSale) {
        this.name = name;
        this.staffID = staffID;
        this.totalHoursWork = totalHoursWork;
        this.totalSale = totalSale;
    }

    public void calculateCommission(){
        if(totalSale>=150&&totalSale<=300){
            this.commision = 0.05;
        }else if(totalSale>300&&totalSale<=500){
            this.commision = 0.1;
        }else if (totalSale>500){
            this.commision = 0.15;
        }
    }

    public void calculateSalary(){
        double salaryTemp = totalHoursWork*8;
        double totalCommision = totalSale*commision;
        this.salary = totalCommision+salaryTemp;

    }

    public void displaySalary(){
        System.out.println("+_+_+_+_+_+_+_++_+__+_+_+_+_+_");
        System.out.println("Staff Name :"+this.name);
        System.out.println("StaffID    :"+this.staffID);
        System.out.println("Hours Wordk:"+this.totalHoursWork);
        System.out.println("Total Sale :"+this.totalSale);
        System.out.println("Total Salary:"+this.salary);
        System.out.println("+_+_+_+_+_+_+_++_+__+_+_+_+_+_");
    }
}
