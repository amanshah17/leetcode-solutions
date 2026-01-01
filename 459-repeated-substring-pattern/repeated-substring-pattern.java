class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String combineTwoString = s + s;
        String newString = combineTwoString.substring(1, combineTwoString.length() - 1);
        return newString.contains(s);
    }
}