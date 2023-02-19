package warmup;

public class ReverseVowels{

    private String input;

    private static char[] VOWELS = {'a','e','i','o','u', 'A', 'E', 'I', 'O', 'U'};

    public ReverseVowels(String input){
        this.input = input;
    }

    public String reverseVowels(){

        char[] arrOfChar = this.input.toCharArray();

        int vowelPtr1 = 0;
        int vowelPtr2 = arrOfChar.length-1;
        while(vowelPtr1 < vowelPtr2){
            if(isVowel(arrOfChar[vowelPtr1])){
                if(isVowel(arrOfChar[vowelPtr2])){
                    char temp = arrOfChar[vowelPtr1];
                    arrOfChar[vowelPtr1] = arrOfChar[vowelPtr2];
                    arrOfChar[vowelPtr2] = temp;
                    vowelPtr1++;
                }
                vowelPtr2--;
            }else{
                if(!isVowel(arrOfChar[vowelPtr2])){
                    vowelPtr2--;
                }
                vowelPtr1++;
            }
        }

        return new String(arrOfChar);
    }

    private boolean isVowel(char target){
        for(char vowel : VOWELS){
            if(vowel == target) return true;
        }
        return false;
    }
}