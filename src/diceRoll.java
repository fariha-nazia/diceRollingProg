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
                printDie(roll);
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


    /*
    * Display ASCII art
    * Creating the method
    * will return nothing, thus using void
    * will have a parameter which is int roll
    * */
    static void printDie(int roll){
//        Making the ASCII art
        String dice1 = """
                --------------------
                 |                 |
                 |                 | 
                 |        ⚫️       |
                 |                 |
                 |                 |
                 --------------------
                """;
//        System.out.println(dice1);

        String dice2 = """
                --------------------
                 |    ⚫           |
                 |                 | 
                 |                 |
                 |                 |
                 |             ⚫️  |
                 --------------------
                """;
//        System.out.println(dice2);

        String dice3 = """
                --------------------
                 |    ⚫           |
                 |                 | 
                 |         ⚫      |
                 |                 |
                 |             ⚫️  |
                 --------------------
                """;
//        System.out.println(dice3);

        String dice4 = """
                --------------------
                 |    ⚫      ⚫  |
                 |                 | 
                 |                 |
                 |                 |
                 |    ⚫      ⚫️  |
                 --------------------
                """;
//        System.out.println(dice4);

        String dice5 = """
                --------------------
                 |    ⚫       ⚫ |
                 |                 | 
                 |         ⚫      |
                 |                 |
                 |    ⚫       ⚫️ |
                 --------------------
                """;
//        System.out.println(dice5);

        String dice6 = """
                --------------------
                 |    ⚫       ⚫️ |
                 |                 | 
                 |    ⚫       ⚫️ |
                 |                 |
                 |    ⚫       ⚫️️ |
                 --------------------
                """;
//        System.out.println(dice6);

        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll");
        }
    }


}
