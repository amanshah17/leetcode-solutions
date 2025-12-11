class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq1 = frequency(s);
    	int[] freq2 = frequency(t);
    	for(int i = 0; i < 26; i++) {
    		if(freq1[i] != freq2[i]) {
    			return false;
    		}
    	}
    	return true;
    }
    private static int[] frequency(String str) {
    	 int[] freq = new int[26];
    	 for(int i = 0; i < str.length(); i++) {
    		 freq[str.charAt(i)-97]++;
    	 }
    	 return freq;
     }
}