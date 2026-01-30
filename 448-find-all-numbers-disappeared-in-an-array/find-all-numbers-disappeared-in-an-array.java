class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int[] freq = new int[n+1];
        for(int x : nums){
            freq[x]++;
        }
        for(int i = 1; i <= n; i++){
            if(freq[i] == 0){
                list.add(i);
            }
        }
        return list;
    }
}