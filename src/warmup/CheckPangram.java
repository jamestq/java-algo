package warmup;

import java.util.HashSet;

public class CheckPangram{
    
    private String input;

    public CheckPangram(String input){
        this.input = input.toLowerCase().trim();
    }

    public boolean checkIfPangram(){
        HashSet<Character> alphabet = new HashSet<Character>();
        for(int i=0; i<this.input.length(); i++) alphabet.add(input.charAt(i));
        return alphabet.size() == 26;
    }

}