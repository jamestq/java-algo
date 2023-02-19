package twopointers;

public class RemoveDuplicate{
    private int[] sortedNums;

    public RemoveDuplicate(int[] sortedNums){
        this.sortedNums = sortedNums;
    }

    public int remove(){
        int uniqueIndex = 1;
        for(int i=1; i<this.sortedNums.length; i++){
            if(this.sortedNums[uniqueIndex-1] != this.sortedNums[i]){
                this.sortedNums[uniqueIndex] = this.sortedNums[i];
                uniqueIndex++;
            }
        }
        String outputString = "[ ";
        for(int num : this.sortedNums){
            outputString += num + " ";
        }
        outputString += "]";
        System.out.println(outputString);
        return uniqueIndex;
    }

}