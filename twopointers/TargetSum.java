package twopointers;

public class TargetSum{

    private int target;

    public TargetSum(int target){
        this.target = target;
    }

    public String getPair(int[] sortedArray){

        //Checks if array length is valid for a pair return;
        if(sortedArray.length == 1){
            return "array length must be more than one";
        }

        //Checks that the array is sorted, and if not, exits the function 
        for(int i=0; i<sortedArray.length-2; i++){
            if(sortedArray[i] > sortedArray[i+1]) return "array is not sorted";
        }

        //Provides start, end pointers and the sum to be compared to the target sum
        int startPointer = 0;
        int endPointer = sortedArray.length-1;
        int sum = 0;
        
        //print array
        System.out.println("Target sum is: " + this.target);
        System.out.print("Array for checking: ");
        System.out.print("[ ");
        for(int i : sortedArray){
            System.out.print(i + " ");
        }
        System.out.println("]");

        //Checks pairs
        do{
            sum = sortedArray[startPointer] + sortedArray[endPointer];
            if(sum==this.target){
                return "Found pair! [" + sortedArray[startPointer] + "," + sortedArray[endPointer] + "]" ;
            }else{
                System.out.println("current pair: ["+sortedArray[startPointer] + "," + sortedArray[endPointer] + "]");
                if(sum > this.target){
                    endPointer--;
                }else{
                    startPointer++;
                }

            }
        }while(startPointer!=endPointer);

        return "No pair was found that match the target: " + this.target;
    }
}