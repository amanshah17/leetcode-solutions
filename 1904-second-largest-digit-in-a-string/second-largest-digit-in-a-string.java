class Solution {
    public int secondHighest(String s) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Character c: s.toCharArray()){
            if(c >= '0' && c <= '9'){
               map.put(c-48,map.getOrDefault(c-48,0)+1);
            }
        }
        if(map.isEmpty() || map.size() == 1){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getKey() > max){
                secondMax = max;
                max = entry.getKey();
            }else if(entry.getKey() > secondMax && entry.getKey() != max){
                secondMax = entry.getKey();
            }
        }
        return secondMax;
    }
}