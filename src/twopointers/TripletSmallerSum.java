package twopointers;

import java.util.Arrays;

public class TripletSmallerSum{

    private int[] nums;
    private int target;
    
    public TripletSmallerSum(int[] nums, int target){
        this.nums = nums;
        this.target = target;
    }

    public int searchTriplet(){
        if(this.nums == null || this.nums.length < 3){
            throw new Error("invalid array. Please try again");
        }
        Arrays.sort(this.nums);
        int numOfTriplets = 0;
        for(int firstNum=0; firstNum<this.nums.length-2; firstNum++){
            int secondNum = firstNum+1;
            int thirdNum = this.nums.length-1;
            while(secondNum<thirdNum){
                int diff = this.target - this.nums[firstNum] - this.nums[secondNum] - this.nums[thirdNum];
                if(diff>0){
                    numOfTriplets += (thirdNum-secondNum);
                    secondNum++;
                }else{
                    thirdNum--;
                }
            }
        }
        return numOfTriplets;
    }

}