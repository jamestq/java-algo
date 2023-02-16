import tests.*;
import java.util.Scanner;

public class MainExecute{

    private static String[] PROGRAMS = {
        "Find a pair that matches the target sum. ",
        "Check if an array has duplicates", 
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
        }
        userInput.close();
    }
}