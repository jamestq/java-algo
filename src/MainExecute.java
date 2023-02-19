import tests.*;
import java.util.Scanner;

public class MainExecute{

    private static String[] PROGRAMS = {
        "Find a pair that matches the target sum. ",
        "Check if an array has duplicates",
        "Check if string is a panagram",
        "Get Square Root of x rounded to the nearest integer",
        "Reverse the vowels in a string"
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
            default: System.out.println("No valid program selected");
        }
        userInput.close();
    }
}