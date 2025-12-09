class Solution {
    public String mergeAlternately(String word1, String word2) {
        String newWord = "";
        int i = 0;
        while(i < word1.length() && i < word2.length()){
            newWord =newWord+ word1.charAt(i)+word2.charAt(i);
            i++;
        }
        if(i < word1.length()){
           newWord += word1.substring(i);
        }
        if(i < word2.length()){
            newWord += word2.substring(i);
        }
        return newWord;
    }
}