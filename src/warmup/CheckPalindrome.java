package warmup;

public class CheckPalindrome{

    private String input;

    public CheckPalindrome(String input){
        //removes space and non-alphanumeric characters before assigning to instance variable
        this.input = input.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    public boolean checkPalindrome(){
        char[] arrOfChar = this.input.toCharArray();
        int startPoint = 0;
        int endPoint = arrOfChar.length-1;
        boolean isPalindrome = true; //assumes string is a palindrome
        while(startPoint < endPoint){
            if(arrOfChar[startPoint] != arrOfChar[endPoint]){
                isPalindrome = false;
                break;
            }
            startPoint++;
            endPoint--;
        }
        return isPalindrome;
    }
}