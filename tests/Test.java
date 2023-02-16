package tests;
import twopointers.*;
import warmup.*;
import java.util.Scanner;


public class Test{

    private static Scanner userInput = new Scanner(System.in);

    public static void testPairSum(){
        System.out.print("Enter target sum: ");
        int inputSum = Integer.parseInt(userInput.nextLine());
        TargetSum targetSum = new TargetSum(inputSum);
        System.out.print("Enter array size: ");
        int[] array = createArray(Integer.parseInt(userInput.nextLine()));
        System.out.println(targetSum.getPair(array));
    }

    public static void testDuplicate(){
        System.out.print("Enter array size: ");
        CheckDuplicate solution = new CheckDuplicate(createArray(Integer.parseInt(userInput.nextLine())));
        System.out.println(solution.containsDuplicate());
    }

    public static void testPangram(){
        System.out.print("Enter String: ");
        CheckPangram newPangram = new CheckPangram(userInput.nextLine());
        System.out.println(newPangram.checkIfPangram());
    }

    public static void testSqrt(){
        System.out.print("Enter number: ");
        CheckSqrt newSqrt = new CheckSqrt(Integer.parseInt(userInput.nextLine()));
        System.out.println(newSqrt.mySqrt());
    }

    public static int[] createArray(int arraySize){
        int[] array = new int[arraySize];
        for(int i=0; i<arraySize; i++){
            System.out.printf("Enter value for array element %d: ", (i+1));
            array[i] = Integer.parseInt(userInput.nextLine());
        }
        return array;
    }
}