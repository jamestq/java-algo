import twopointers.*;

public class MainExecute{
    public static void main(String[] args){
        TargetSum targetSum = new TargetSum(6);

        int[] array = {1,2,3,4,6};

        System.out.println(targetSum.getPair(array));
    }
}