import  java.util.Scanner;
public class TriangleDemo{
   public static void main(String[] args){
   
     Scanner scanner = new Scanner(System.in);
Triangle triangle = new Triangle();

System.out.print("Enter height:");
int height = scanner.nextInt();
System.out.print("Enter base:");
int base = scanner.nextInt();

triangle.setBase(base);
triangle.setHeight(height);

System.out.println("The pyramid's height is "+triangle.getHeight());
System.out.println("The pyramid's base is "+triangle.getBase());
System.out.println("The pyramid's area is "+triangle.getArea());

   }
}
