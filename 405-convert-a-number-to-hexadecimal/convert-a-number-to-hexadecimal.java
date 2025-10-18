class Solution {
    public String toHex(int num) {
        String hex = "";
        if(num == 0){
            return "0";
        }
        if(num < 0){
            return Integer.toHexString(num).toLowerCase();
        }
        while(num > 0){
            int rem = num % 16;
            if(rem < 10){
                hex = rem + hex;
            }else{
                hex = (char)(rem+87)+hex;
            }
            num /= 16;
        }
        return hex;
    }
}