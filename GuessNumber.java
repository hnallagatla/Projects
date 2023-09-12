package SE_17;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int userGuess = scanner.nextInt();


        while(userGuess != randomNumber){
            if(userGuess < randomNumber)
                System.out.println("too low");
            else if(userGuess > randomNumber)
                System.out.println("too high");
            userGuess = scanner.nextInt();
        }

        System.out.println("correct");
    }
}
