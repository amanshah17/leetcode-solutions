class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freq = frequency(sentence);
        for(int i = 0; i < 26; i++){
            if(freq[i] == 0){
                return false;
            }
        }
        return true;
    }
    private int[] frequency(String str){
       int[] freq = new int[26];
       for(int i = 0; i < str.length();i++){
         freq[str.charAt(i)-97]++;
       } 
       return freq;
    }
}