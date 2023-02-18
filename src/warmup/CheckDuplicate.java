package warmup;

import java.util.HashSet;

public class CheckDuplicate {

    private int[] array;

    public CheckDuplicate(int[] array){
        this.array = array;
    }

    public boolean containsDuplicate() { 
        HashSet<Integer> numberSet = new HashSet<>();
        for(int i : array){
            if(!numberSet.add(i)) return true;
        }
        return false;
    }
}



