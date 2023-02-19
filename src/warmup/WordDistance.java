package warmup;

public class WordDistance{

    private String[] words;
    private String word1;
    private String word2;

    public WordDistance(String[] words, String word1, String word2){
        this.words = words;
        this.word1 = word1;
        this.word2 = word2;
    }

    public int shortestDistance(){
        int ptr1 = -1;
        int ptr2 = -1;
        int shortestDistance = words.length;

        for(int i=0; i<this.words.length; i++){
            if(words[i].equals(word1)){
                ptr1 = i;
            }else if(words[i].equals(word2)){
                ptr2 = i;
            }
            if(ptr1!=-1 && ptr2!=-1){
                shortestDistance = Math.abs(ptr1 - ptr2);
            }   
        }
        return shortestDistance;
    }
}