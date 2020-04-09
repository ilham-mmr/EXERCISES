public class TestStudent {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String matricNo;
        double test1, test2;

        Student [] studDegree = new Student[3];

        for(int i = 0 ; i<studDegree.length;i++){
            System.out.print("Matric No:");
            matricNo = input.nextLine();
            System.out.print("test 1: ");
            test1 = input.nextDouble();
            System.out.print("test 2: ");
            test2 = input.nextDouble();
            input.nextLine();
            studDegree[i] = new Student(matricNo,test1,test2);
        }

        System.out.println("\n" +
                " *****************************\n" +
                "      STUDENT INFORMATION\n" +
                " *****************************\n");
        System.out.println("\tMatric No \tAverage Mark");
        for(int i = 0 ; i<studDegree.length;i++){

            studDegree[i].calculateAverage();
            System.out.println(studDegree[i].getStudentInfo());

        }
    }
}
