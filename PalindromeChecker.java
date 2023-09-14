package SE_17;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        boolean isPalindrome = false;
        boolean isPalindromeChecking = true;
        int inputLength = userInput.length();
        int indexOne = 0;
        int indexTwo = inputLength -1;
        
        while(isPalindromeChecking){
            boolean validIndexes = indexOne <= (inputLength -1) && indexTwo >= 0;
            if(validIndexes && areLettersEqual(userInput, indexOne, indexTwo)){
                    indexOne++;
                    indexTwo--;
                    isPalindrome = true;
            }else if (validIndexes == false)
                break;
            else {
                isPalindromeChecking = false;
                isPalindrome = false;
                break;
            }
        }
        String stringResult = isPalindrome? "The entered string is a palindrome": "The entered string is not a palindrome";
        System.out.println(stringResult);
    }
    public static boolean areLettersEqual(String userInput, int indexOne, int indexTwo){
        String lowerCase = userInput.toLowerCase();
        return lowerCase.charAt(indexOne) == lowerCase.charAt(indexTwo);
    }
}