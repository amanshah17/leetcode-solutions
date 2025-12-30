class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCount = 0;
        for(int i = 0; i < word.length();i++){
            if(word.charAt(i) >= 65 && word.charAt(i) <= 90){
                upperCount++;
            }
        }
        if(upperCount == word.length()){
            return true;
        }
        if(upperCount == 0){
            return true;
        }
        if(upperCount == 1 && word.charAt(0) >= 65 && word.charAt(0) <= 90){
            return true;
        }
        return false;
    }
}