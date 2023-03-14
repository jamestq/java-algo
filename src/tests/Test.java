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

    public static void checkReverseVowel(){
        System.out.print("Enter String: ");
        ReverseVowels newRevseVowels = new ReverseVowels(userInput.nextLine());
        System.out.println(newRevseVowels.reverseVowels());
    }

    public static void checkPalindrome(){
        System.out.print("Enter String: ");
        CheckPalindrome newPalindrome = new CheckPalindrome(userInput.nextLine());
        System.out.println(newPalindrome.checkPalindrome());
    }

    public static void checkAnagram(){
        System.out.print("Enter String: ");
        String input = userInput.nextLine();
        System.out.print("Enter check String: ");
        String checkString = userInput.nextLine();
        CheckAnagram newAnagram = new CheckAnagram(input, checkString);
        System.out.println(newAnagram.checkAnagram());
    }

    public static void checkShortestDistance(){
        System.out.print("Enter array size: ");
        String[] words = createStringArray(Integer.parseInt(userInput.nextLine()));
        System.out.print("Enter word1: ");
        String word1 = userInput.nextLine();
        System.out.print("Enter word2: ");
        String word2 = userInput.nextLine();
        WordDistance distance = new WordDistance(words, word1, word2);
        System.out.println(distance.shortestDistance());
    }

    public static void checkGoodPair(){
        System.out.print("Enter array size: ");
        int[] nums = createArray(Integer.parseInt(userInput.nextLine()));
        GoodPair pairs = new GoodPair(nums);
        System.out.println(pairs.numGoodPairs());
    }

    public static void checkRemoveDuplicate(){
        System.out.print("Enter array size: ");
        int[] nums = createArray(Integer.parseInt(userInput.nextLine()));
        RemoveDuplicate duplicate = new RemoveDuplicate(nums);
        System.out.println(duplicate.remove());
    }

    public static void checkSquareArray(){
        System.out.print("Enter array size: ");
        int[] nums = createArray(Integer.parseInt(userInput.nextLine()));
        int[] squares = (new SquareArray(nums)).makeSquares();
        for(int square : squares){
            System.out.print(square + " ");
        }
        System.out.println();
    }

    public static void checkTripletSum(){
        System.out.print("Enter array size: ");
        int[] nums = createArray(Integer.parseInt(userInput.nextLine()));
        TripletZeroSum tripletSum = new TripletZeroSum(nums);
        System.out.println(tripletSum.searchTriplets());
    }

    public static void checkTargetTripletSum(){
        System.out.print("Enter array size: ");
        int[] nums = createArray(Integer.parseInt(userInput.nextLine()));
        System.out.print("Enter target sum: ");
        int target = Integer.parseInt(userInput.nextLine());
        TripletTargetSum tripletSum = new TripletTargetSum(nums, target);
        System.out.println(tripletSum.searchTriplet());
    }

    public static void checkSmallerTripletSum(){
        System.out.print("Enter array size: ");
        int[] nums = createArray(Integer.parseInt(userInput.nextLine()));
        System.out.print("Enter target sum: ");
        int target = Integer.parseInt(userInput.nextLine());
        TripletSmallerSum tripletSum = new TripletSmallerSum(nums, target);
        System.out.println(tripletSum.searchTriplet());
    }

    public static void checkSmallerProduct(){
        System.out.print("Enter array size: ");
        int[] nums = createArray(Integer.parseInt(userInput.nextLine()));
        System.out.print("Enter target sum: ");
        int target = Integer.parseInt(userInput.nextLine());
        SmallerProduct smallerProduct = new SmallerProduct(nums, target);
        System.out.println(smallerProduct.searchSub());
    }

    public static int[] createArray(int arraySize){
        int[] array = new int[arraySize];
        for(int i=0; i<arraySize; i++){
            System.out.printf("Enter value for array element %d: ", (i+1));
            array[i] = Integer.parseInt(userInput.nextLine());
        }
        return array;
    }

    public static String[] createStringArray(int arraySize){
        String[] array = new String[arraySize];
        for(int i=0; i<arraySize; i++){
            System.out.printf("Enter string for array element %d: ", (i+1));
            array[i] = userInput.nextLine();
        }
        return array;
    }
}