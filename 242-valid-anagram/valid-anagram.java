class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(Character c : s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(Character c : t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if(!map2.containsKey(c) || ! map1.get(c).equals(map2.get(c))){
                return false;
            }
        }
    return true;
    }
}