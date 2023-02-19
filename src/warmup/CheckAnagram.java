package warmup;

import java.util.HashMap;

public class CheckAnagram{
    private String input;
    private String checkString;

    public CheckAnagram(String input, String checkString){
        this.input = input;
        this.checkString = checkString;
    }

    public boolean checkAnagram(){
        if(this.input.length() != this.checkString.length()) return false;
        char[] inputChar = this.input.toCharArray();
        char[] checkChar = this.checkString.toCharArray();
        HashMap<Character, Integer> newMap = new HashMap<>();
        for(int i=0; i<inputChar.length; i++){
            newMap.put(inputChar[i], newMap.getOrDefault(inputChar[i], 0) + 1);
            newMap.put(checkChar[i], newMap.getOrDefault(checkChar[i], 0) - 1);
        }

        for(char c : newMap.keySet()){
            if(newMap.get(c) != 0){
                return false;
            }
        }

        return true;
    }
} 