class Solution {
    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        int maxVowel = 0;
        int maxConsonant = 0;
        for (int i = 0; i < 26; i++) {
            int count = freq[i];
            if (count > 0) {
                char ch = (char) ('a' + i);
                if (isVowel(ch)) {
                    if (count > maxVowel) maxVowel = count;
                } else {
                    if (count > maxConsonant) maxConsonant = count;
                }
            }
        }

        return maxVowel + maxConsonant;
    }
}