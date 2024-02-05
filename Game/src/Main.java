//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Generate a random number
        Random rand = new Random();
        int randomInteger = rand.nextInt(100);
        int userChoice = userInput();

    }
    public static Integer userInput() {
        System.out.println("guess a number");
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    };
}