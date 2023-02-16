package tests;
import twopointers.*;
import warmup.*;


public class Test{

    public static void testPairSum(){
        TargetSum targetSum = new TargetSum(6);
        int[] array = {1,2,3,4,6};
        System.out.println(targetSum.getPair(array));
    }

    public static void testDuplicate(){
        CheckDuplicate solution = new CheckDuplicate();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println(solution.containsDuplicate(nums1)); // Expected output: false

        int[] nums2 = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums2)); // Expected output: true

        int[] nums3 = {};
        System.out.println(solution.containsDuplicate(nums3)); // Expected output: false

        int[] nums4 = {1, 1, 1, 1};
        System.out.println(solution.containsDuplicate(nums4)); // Expected output: true
    }
}