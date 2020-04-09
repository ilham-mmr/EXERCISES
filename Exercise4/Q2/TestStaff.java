import java.util.Scanner;
class TestStaff {
	static Scanner console = new Scanner(System.in);
public static void main(String[] args) {
    System.out.print("Enter the staff name:");
    String name = console.nextLine();
    System.out.print("Enter the staff id:");
    String staffId = console.nextLine();
    System.out.print("Enter working days: ");
    int workingDay = console.nextInt();

    Staff staff1 = new Staff();
    staff1.setStaffInfo(name,staffId,workingDay);
    staff1.calculateSalary();
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    System.out.println("Staff name : "+staff1.getName());
    System.out.println("Staff id :"+staff1.getStaffID());
    System.out.println("Salary: "+staff1.getSalary());
    System.out.println("_________________________________");

}


}//end class
