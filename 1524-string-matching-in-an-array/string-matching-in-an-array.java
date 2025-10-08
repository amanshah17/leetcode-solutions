class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (String s1 : words) {
           for (String s2 : words) {
                if (!s1.equals(s2) && s2.contains(s1)) {
                    result.add(s1); 
                    break;         
                }
            }
        }
         
        return result;
    }
}