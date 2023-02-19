import tests.*;
import java.util.Scanner;

public class MainExecute{

    private static String[] PROGRAMS = {
        "Find a pair that matches the target sum. ",
        "Check if an array has duplicates",
        "Check if string is a panagram",
        "Get Square Root of x rounded to the nearest integer",
        "Reverse the vowels in a string",
        "Check is a String is a palindrome",
        "Check is two strings are anagram of each other",
        "Given an array of words, get the distance of word1, word2 (two strings existing in words)",
        "Count the number of good pairs in an array",
        "Remove duplicates from an array of numbers",
        "Square a sorted array",
        "Find triplets from an array that sums to zero",
        "Find triplet with sum closest to target"
    };

    public static void main(String[] args){
        System.out.println("Select the following programs to run: ");
        for(int i=0; i<PROGRAMS.length; i++){
            System.out.println((i+1) + ". " + PROGRAMS[i]);
        }
        System.out.print("> ");
        Scanner userInput = new Scanner(System.in);
        int choice = Integer.parseInt(userInput.nextLine());
        System.out.println("Running program...");
        switch(choice){
            case 1: Test.testPairSum(); break;
            case 2: Test.testDuplicate(); break;
            case 3: Test.testPangram(); break;
            case 4: Test.testSqrt(); break;
            case 5: Test.checkReverseVowel(); break;
            case 6: Test.checkPalindrome(); break;
            case 7: Test.checkAnagram(); break;
            case 8: Test.checkShortestDistance(); break;
            case 9: Test.checkGoodPair(); break;
            case 10: Test.checkRemoveDuplicate(); break;
            case 11: Test.checkSquareArray(); break;
            case 12: Test.checkTripletSum(); break;
            default: System.out.println("No valid program selected");
        }
        userInput.close();
    }
}