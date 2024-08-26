import java .util.Scanner;
public class IT24100210Lab5Q1
{
    public static void main(String[] args)
{
      // Declare the variables
	int number1,number2,number3;

	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter the first integer: ");
	  number1 = input.nextInt();
	  
	  System.out.print("Enter the second integer: ");
	  number2 = input.nextInt();
	  
	  System.out.print("Enter the second integer: ");
	  number3 = input.nextInt();
	  
	  int smallest = number1;
	  int largest  = number1;
	  
	  
	  if (number2< smallest) {
	  smallest = number2;
	  }
	  if (number2> largest) {
	  largest = number2;
	  }
	  
	  if (number3< smallest) {
	  smallest = number3;
	  }
	  if (number3> largest) {
	  largest = number3;
	  }
	  
	  System.out.println("");
	  System.out.println("User entered number are: " +number1+" "+number2+" "+number3);
	  System.out.println("The smallest number is: " +smallest);
	  System.out.println("The largest number is: " +largest);
	  
	     
   }
   
}