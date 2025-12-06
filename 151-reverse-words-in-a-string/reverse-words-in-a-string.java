class Solution {
    public String reverseWords(String str) {
        String word = "";
		String temp = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			char c = str.charAt(i);
			if(c != ' ') {
				temp = c+temp;
			}else{
                if (!temp.isEmpty()) {
                   word = word + temp + " ";
                   temp = "";
                }
            }
			if(i == 0 && !temp.isEmpty()){
				word = word+temp;
				temp = "";
			}
		}
        return word.trim();
    }
}