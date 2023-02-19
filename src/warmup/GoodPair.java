package warmup;

import java.util.HashMap;

public class GoodPair{

    private int[] nums;

    public GoodPair(int[] nums){
        this.nums = nums;
    }

    public int numGoodPairs(){
        int pairCount = 0;
        HashMap<Integer, Integer> numMap = new HashMap<>();
        
        for(int num : this.nums){
            numMap.put(num, numMap.getOrDefault(num, 0)+1);
            pairCount += numMap.get(num) - 1;
        }

        return pairCount;
    }

}