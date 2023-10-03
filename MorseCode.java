package SE_17;

import java.util.Arrays;
import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {

        System.out.println("Enter a String");
        Scanner scanner = new Scanner(System.in);
        String inputWord = scanner.nextLine().toLowerCase();

        String morseString = " ";

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        for (int i = 0; i<inputWord.length(); i++){
            if (inputWord.charAt(i) == ' ') morseString += "/";
            else morseString += morse[Arrays.binarySearch(letters, inputWord.charAt(i))];
        }

        System.out.println(morseString);
    }
}
