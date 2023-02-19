package twopointers;

public class SquareArray{

    private int[] nums;

    public SquareArray(int[] nums){
        this.nums = nums;
    }

    public int[] makeSquares(){

        int ptrStart = 0;
        int ptrEnd = this.nums.length-1;

        int[] squaredNums = new int[this.nums.length];

        int squaredNumsIndex = this.nums.length-1;
        while(ptrStart < ptrEnd){
            int num1 = this.nums[ptrStart]*this.nums[ptrStart];
            int num2 = this.nums[ptrEnd]*this.nums[ptrEnd];
            if(num1 > num2){
                squaredNums[squaredNumsIndex] = num1;
                ptrStart++;
            }else{
                squaredNums[squaredNumsIndex] = num2;
                ptrEnd--;
            }
            squaredNumsIndex--;
        }
        squaredNums[0] = this.nums[ptrStart]*this.nums[ptrStart];
        return squaredNums;
    }
}