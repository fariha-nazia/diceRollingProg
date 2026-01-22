import java.util.Scanner;
import java.util.Random;

public class diceRoll {
    public static void main(String[] args){
        /*
        * Dice Rolling Prog:
        *   - Take user input of number of Dice they would like to roll
        *   - Based on each die roll we will display ASCII art
        *   - In the end return user the sum of two numbers in the dice.
        *   - This prog will generate random number
        *
        * To Do:
        *   - Declare variable
        *   - Get number of the dice from user
        *   - check if number of dice greater than 0
        *   - Roll all the dice
        *   - Get the total (Sum of the numbers)
        *   - Display ASCII of
        * */

//        Taking user input
        Scanner scan = new Scanner(System.in);
//        Generate random number
        Random rand = new Random();

//        Declaring the variables
        int numOfDice; // How many dice are we rolling
        int total = 0; // Sum up all the dice for total

//        Take input of number of Dice
        System.out.println("Enter the number of dice: ");
        numOfDice = scan.nextInt();

//        Check if num of dice is greater than 0
        if(numOfDice > 0){
            for (int i = 0; i < numOfDice; i++){
                int roll = rand.nextInt(1, 7);
                System.out.println("You Rolled " + roll);
                total = total + roll;
            }
            System.out.println("Your total is: " + total);
        }
        else{
            System.out.println("Number of Dice must be greater than 0");
        }


        scan.close();
    }

    /*
    * METHODS ARE WRITTEN HERE
    * */
}
