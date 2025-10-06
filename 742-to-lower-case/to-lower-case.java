class Solution {
    public String toLowerCase(String s) {
        String lowerStr = "";
        for(char ch:s.toCharArray()){
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch+32);
                lowerStr +=ch;
            }else{
               lowerStr +=ch; 
            }
        }
        return lowerStr;
    }
}