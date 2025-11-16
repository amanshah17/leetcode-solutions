class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer,Integer>m1 = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int x:nums){
            m1.put(x,m1.getOrDefault(x,0)+1);
        }
        for(Integer key:m1.keySet()){
            if( m1.get(key) == 1 && !m1.containsKey(key+1) && !m1.containsKey(key-1)){
               list.add(key);
            }
        }
        return list;
    }
}