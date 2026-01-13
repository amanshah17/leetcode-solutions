class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int[] freq = new int[101];

        int j = 0;
        for(int i = 0; i < n; i++){
            freq[nums[i]+50]++;
            if(i-j+1 > k){
                freq[nums[j]+50]--;
                j++;
            }
            if(i-j+1 == k){
                ans[j] = findXthSmallest(freq,x);
            }
        }
        return ans;
    }
    private int findXthSmallest(int[] freq, int x){
        int count = 0;
        for(int i = 0; i < 50; i++){
            if(freq[i] > 0){
                count += freq[i];
                if(count >= x){
                    return i-50;
                }
            }
        }
        return 0;
    }
}