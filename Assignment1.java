import java.util.Scanner;
import java.util.Random;
/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: Create ESP game
 * Due: 07/07/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Talia Kouncar
*/

public class Assignment1 {

	public static void main(String[] args) {

		final int MIN = 0;
		final int MAX= 4;
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in); //Create our scanner object
		Random random = new Random();
		
		System.out.println("Enter your name:");
        String name = myObj.nextLine(); //Read user name input
        System.out.println("Enter your MC M#:");
        String mNum = myObj.nextLine(); //Read user M# input
        System.out.println("Describe yourself:");
        String description = myObj.nextLine(); //Read user description input
        System.out.println("Due Date:");
        String dueDate = myObj.nextLine(); //Read user due date input
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");
        int correctGuesses=0;
        String computerColorString = "";
		
        for (int i = 1; i<=10; i++) { //This for loop makes sure this program runs 10 times
            int computerColor= MIN + (int)(Math.random() * MAX);

            //loop to make it run 10 rounds
            System.out.println("Round "+i);
            System.out.println("I am thinking of a color.\nIs it Red, Green, Blue, Orange, or Yellow?");
            int userColor= myObj.nextInt();
            if (userColor <0 || userColor>4) { //this if statement checks if the input was valid
                System.out.println ("Please enter a number that is between 0-4");
                System.out.println("Enter your guess here: ");
                userColor = myObj.nextInt();
            }
		
        switch (computerColor) { //Utilizing a switch statement
        case 0: computerColorString = "Red";
        break;
        case 1: computerColorString = "Green";
        break;
        case 2: computerColorString = "Blue";
        break;
        case 3: computerColorString = "Orange";
        break;
        case 4: computerColorString = "Yellow";
        break;

        	}
        
        //computer outputs its choice
        System.out.println("I was thinking of " + computerColorString + "\n");
        
        
        if (computerColor == userColor) //checks if they match
              correctGuesses++;
        }
        
        //final statements 
        System.out.println("You guessed "+ correctGuesses + " out of 10 colors correctly.");
        System.out.println("User Name: " + name);
        System.out.println("Student MC M#: "+mNum);
        System.out.println("User Description: "+description);
        System.out.println("Date: "+dueDate);
        
	}
}