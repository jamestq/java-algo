package twopointers;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TripletZeroSum{

    private int[] nums;

    public TripletZeroSum(int[] nums){
        this.nums = nums;
    }

    public List<List<Integer>> searchTriplets(){
        //sort the array
        Arrays.sort(this.nums);
        List<List<Integer>> triplets = new ArrayList<>();
        for(int i=0; i<this.nums.length-2; i++){
            if(i>0 && this.nums[i] == this.nums[i-1]) continue;
            findPair(-this.nums[i], i+1, this.nums.length-1, triplets);
        }
        return triplets;
    }

    private void findPair(int targetSum, int left, int right, List<List<Integer>> triplets){
        while(left<right){
            int pairSum = this.nums[left] + this.nums[right];
            if(pairSum == targetSum){
                triplets.add(Arrays.asList(-targetSum, this.nums[left], this.nums[right]));
                left++;
                right--;
                while(left<right && this.nums[left] == this.nums[left-1]){
                    left++;
                }
                while(left<right && this.nums[right] == this.nums[right+1]){
                    right--;
                }
            }else if(pairSum > targetSum){
                right--;
            }else{
                left++;
            }
        }
    };
}