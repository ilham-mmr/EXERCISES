import java.util.Scanner;

public class FourDigitNumber {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); // creating an instance
	System.out.print("Input a four-digit numbers:");

	String input = scanner.nextLine();// getting an input from the console

	String stringNum = "";// initializing stringNum
	int total = 0;//initializing total
	for(int i = 0 ;i<input.length();i++){//iterating each character
		System.out.println(input.charAt(i));
		stringNum = "" + (input.charAt(i));//String.valueOf
		total+=Integer.parseInt(stringNum);//summing up the values

	}



        System.out.println("the sum of the digits :"+ total);// outputting the total
    }
}
