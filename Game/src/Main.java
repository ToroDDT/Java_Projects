//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Generate a random number
        Random rand = new Random();
        // Assign random number to variable
        int randomInteger = rand.nextInt(10);
        System.out.println(randomInteger);
        // assign user input to variable
        int userChoice = userInput();
        // determine if the user won
        boolean answer = wonTheGame(randomInteger, userChoice);
        // if the user did not win continue the game
        // ask for
        while (!answer) {
            userChoice = userInput();
            answer =wonTheGame(randomInteger, userChoice);
        }
        System.out.println("You Won!!");
    }

    public static Integer userInput() {
        System.out.println("guess a number");
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    }

    ;

    public static Boolean wonTheGame(int randomInteger, int number) {
        if (number > randomInteger) {
            return false;
        } else if (number < randomInteger) {
            return false;
        } else return true;

    }


}