package twopointers;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class SmallerProduct{
    
    private int[] nums;
    private int target;

    public SmallerProduct(int[] nums, int target){
        this.nums = nums;
        this.target = target;
    }

    public List<List<Integer>> searchSub(){
        ArrayList<List<Integer>> subArraysList = new ArrayList<>();
        int stopPoint = 0;
        double product = 1;
        for(int ptr=0; ptr<this.nums.length; ptr++){
            product *= this.nums[ptr];  
            while(product>=this.target && stopPoint<this.nums.length){
                product /= this.nums[stopPoint];
                stopPoint++;
            }

            List<Integer> subList = new LinkedList<>();
            for(int i=ptr; i>=stopPoint; i--){
                subList.add(0, this.nums[i]);
                subArraysList.add(new ArrayList<>(subList));
            }
        }
        return subArraysList;
    }

}