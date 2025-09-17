/**
 * Name: [Enter Your Name Here]
 * Date: [Enter Today's Date]
* Purpose: InClass 3 - 
* [Write a description about this InClass 3 program]
 */

// Don't forget to import and declare a Scanner for user input.
import java.util.Scanner;

public class InClass3_Ariana_Rodriguez
{
    public static void main(String[] args) 
    {

    Scanner input = new Scanner(System.in);
        // In-Class 3 Example:
        // Step 1: Prompt the user to enter the length of the side of a cube.
      double side, volume, surfaceArea; //declare these varibales as double types of data
      


        // Step 2: Read the user's input and store it in a variable.
        System.out.println("please enter the length of the side of the cube");
        side = input.nextDouble(); //prompt user

        // Step 3: Use an appropriate method to determine the volume of the cube.
        volume = Math.pow(side, 3);

        // Step 4: Use an appropriate method to determine the surface area of the cube.
        surfaceArea = 6* Math.pow(side, 2);

        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method


        // Step 5: Print the volume and surface area in clear sentences.
        System.out.println("The volume of the cube is" + volume);
        System.out.println("the surface area of the cube is" + surfaceArea);
    }
}