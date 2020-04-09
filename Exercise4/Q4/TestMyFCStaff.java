public class TestMyFCStaff  {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the staff name:");
        String name = console.nextLine();
        System.out.print("Enter the staff id:");
        String staffId = console.nextLine();
        System.out.print("Enter total hours : ");
        int hoursWork = console.nextInt();
        System.out.print("Enter total sale: ");
        double totalSale = console.nextDouble();


        MyFCStaff staff = new MyFCStaff(name,staffId,hoursWork,totalSale);
        staff.calculateCommission();
        staff.calculateSalary();
        System.out.println(staff.toString());
        }
}
