package twopointers;

import java.util.Arrays;
import java.util.ArrayList;

public class TripletTargetSum{
    private int[] nums;
    private int target;

    public TripletTargetSum(int[] nums, int target){
        this.nums = nums;
        this.target = target;
    }

    public int searchTriplet(){

        if(this.nums == null || this.nums.length < 3){
            return 0;
        }

        Arrays.sort(this.nums);

        int smallestDifference = Integer.MAX_VALUE;

        for(int firstNum=0; firstNum<this.nums.length-2; firstNum++){
            int secondNum = firstNum+1;
            int thirdNum = this.nums.length-1;
            while(secondNum<thirdNum){
                int difference = target - this.nums[firstNum] - this.nums[secondNum] - this.nums[thirdNum];
                if(difference == 0){
                    displayTriplet(this.nums[firstNum], this.nums[secondNum], this.nums[thirdNum]);
                    return target;
                }
                if(Math.abs(difference) < Math.abs(smallestDifference) || (Math.abs(difference) == Math.abs(smallestDifference) && difference > smallestDifference)){
                    smallestDifference = difference;
                }
                displayTriplet(this.nums[firstNum], this.nums[secondNum], this.nums[thirdNum]);
                if(difference > 0){
                    secondNum++;
                }else{
                    thirdNum--;
                }
            }
        }
        return target - smallestDifference;
    }

    private void displayTriplet(int firstNum, int secondNum, int thirdNum){
        int[] triplet = {firstNum, secondNum, thirdNum};
        for(int i=0; i<3; i++){
            System.out.print(triplet[i] + " ");
        }
        System.out.println();
    }

}