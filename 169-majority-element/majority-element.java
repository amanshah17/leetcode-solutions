class Solution {
    public int majorityElement(int[] arr) {
        Map<Integer,Integer>m1 = new HashMap<>();

        for(Integer i = 0; i < arr.length;i++){
            m1.put(arr[i], m1.getOrDefault(arr[i], 0)+1);
        }
        for (Integer key : m1.keySet()) {
            if(m1.get(key) > (arr.length)/2){
               return key;
            }
        }
        return -1;  
    }
}