class Solution {
    public String reverseWords(String s) {
        String temp = "";
        String word = "";
        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            if(c != ' '){
               temp = c + temp;
            }else{
                if(!temp.isEmpty()){
                    word = word+temp+" ";
                    temp = "";
                }
            }
            if(i == s.length()-1 && !temp.isEmpty()){
                word = word+temp;
                temp = "";
            }
        }
        return word;
    }
}