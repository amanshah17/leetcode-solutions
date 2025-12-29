class Solution {
    public char findTheDifference(String s, String t) {
    int[] freq1 = frequency(s);
    int[] freq2 = frequency(t);

    for (int i = 0; i < 26; i++) {
        if (freq2[i] > freq1[i]) {
            return (char) (i + 'a');
        }
    }
    return '\0';
}

private int[] frequency(String str) {
    int[] freq = new int[26];
    for (char c : str.toCharArray()) {
        freq[c - 'a']++;
    }
    return freq;
}

}