package d_6June;

public class IsPrefixOfWord {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] strs=sentence.split(" ");
        for(int i=0;i<strs.length;i++){
            if(strs[i].indexOf(searchWord)==0)return i+1;
            //if(strs[i].contains(searchWord))return i+1;
        }
        return -1;
    }
}
