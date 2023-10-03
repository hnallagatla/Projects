package SE_17;

import java.util.Arrays;
import java.util.Scanner;

public class MorseCodeUpdated {
    public static void main(String[] args) {

        System.out.println("Are you entering Morse or English? Enter M for Morse and E for English.");
        Scanner whichOne = new Scanner(System.in);
        String whichVersion = whichOne.nextLine().toLowerCase();


        System.out.println("Enter a String");
        Scanner scanner = new Scanner(System.in);
        String inputWord = scanner.nextLine().toLowerCase();

        String morseString = " ";

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        if(whichVersion.equals("e")) {
            for (int i = 0; i < inputWord.length(); i++) {
                if (inputWord.charAt(i) == ' ') morseString += "/";
                else {
                    System.out.println(Arrays.binarySearch(letters, inputWord.charAt(i)));
                    morseString += morse[Arrays.binarySearch(letters, inputWord.charAt(i))];
                }
            }
        } else{
            String[] enteredMorse = inputWord.split(" ");
            for(int i = 0; i<enteredMorse.length; i++){
                System.out.println(Arrays.binarySearch(morse, enteredMorse[i]));
                System.out.println(enteredMorse[i]);
                morseString += letters[Arrays.binarySearch(morse, enteredMorse[i])];
            }
        }

        System.out.println(morseString);
    }
}
