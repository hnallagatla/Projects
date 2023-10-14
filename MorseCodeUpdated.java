package SE_17;

import java.util.Arrays;
import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {

        System.out.println("Are you entering Morse or English? Enter M for Morse and E for English.");
        Scanner whichOne = new Scanner(System.in);
        String whichVersion = whichOne.nextLine().toLowerCase();


        System.out.println("Enter a String");
        Scanner scanner = new Scanner(System.in);
        String inputWord = scanner.nextLine().toLowerCase();

        StringBuilder morseString = new StringBuilder();

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "/"};

        if(whichVersion.equals("e")){
            for (int i = 0; i<inputWord.length(); i++){
                for(int j = 0; j<letters.length; j++)
                    if (inputWord.charAt(i) == letters[j]) {
                        morseString.append(morse[j]);
                        break;
                    }
            }
        } else if (whichVersion.equals("m")){
            String[] inputMorse = inputWord.split(" ");
            for(int i = 0; i< inputMorse.length; i++){
                    for (int j =0; j<morse.length; j++){
                        if(inputMorse[i].equals(morse[j])){
                            morseString.append(letters[j]);
                            break;
                        }
                    }
                }
        }
        System.out.println(morseString);

        }




    }

