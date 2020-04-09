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
      @Override
    public String toString() {
        return  "+_+_+_+_+_+_+_++_+__+_+_+_+_+_\n" +
                "Staff Name :"+name+"\n" +
                "StaffID    :"+staffID+"\n" +
                "Hours Work:"+totalHoursWork+"\n" +
                "Total Sale : RM"+totalSale+"\n" +
                "Total Salary: RM"+salary+ "\n"+
                "+_+_+_+_+_+_+_++_+__+_+_+_+_+_";
    }
}
