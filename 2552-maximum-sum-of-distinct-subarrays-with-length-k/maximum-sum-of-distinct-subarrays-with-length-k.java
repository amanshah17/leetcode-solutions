class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        long windowSum = 0;
        long maxSum = 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            windowSum += nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            while(i-j+1 > k){
                windowSum -= nums[j];
                map.put(nums[j],map.get(nums[j])-1);

                if(map.get(nums[j]) == 0){
                    map.remove(nums[j]);
                }
                j++;
            }
            if(i-j+1 == k && map.size() == k){
                if(windowSum > maxSum){
                    maxSum = windowSum;
                }
            }
        }
       
        return maxSum;
    }
}