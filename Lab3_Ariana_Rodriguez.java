// Ariana Rodriguez
// 9/16/2025
// compound interest calculation
// import and declare a scanner
import java.util.Scanner;

public class Lab3_Ariana_Rodriguez
{
    public static void main(String[] args) 
    {

     // Create a scanner object for user input
     Scanner input = new Scanner(System.in);
     
     // Declare the required variables
     double initialValue; // this is the initial value for the home
     int years; // number of elapsed years
     double InterestRate; // interest rate (as a %)
     double finalValue; // Final value of the home after interest

     // recieve input from user 
     System.out.println("Please enter the initial value of the home:");
     initialValue = input.nextDouble(); // input initial value from home into scanner

     
     System.out.println("Please enter the number of elapsed years: ");
     years = input.nextInt();

     System.out.println("Please enter the interest rate: ");
     InterestRate = input.nextDouble();
     
     InterestRate = InterestRate / 100; //convert interest rate into a decimal
 
     // convert final value using compound interest formula; A = P(1 + r) ^t
     finalValue = initialValue * Math.pow(1 + InterestRate, years);
     
     System.out.printf("The final value of the home is: %.2f%n", finalValue); // output the result

     input.close(); //closing scanner


     













    } 
 }






