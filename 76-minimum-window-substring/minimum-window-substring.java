class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c: t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int j = 0; 
        int count = map.size();
        int minLength = Integer.MAX_VALUE;
        int start = 0; 
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c) == 0){
                    count--;
                }
            }

            while(count == 0){
                if(i-j+1 < minLength){
                    minLength = i-j+1;
                    start = j;
                }
                char newChar = s.charAt(j++);
                if(map.containsKey(newChar)){
                    map.put(newChar,map.get(newChar)+1);
                    if(map.get(newChar) > 0){
                        count++;
                    }
                }
            }
        }
        return minLength == Integer.MAX_VALUE? "": s.substring(start,start+minLength);
    }
}