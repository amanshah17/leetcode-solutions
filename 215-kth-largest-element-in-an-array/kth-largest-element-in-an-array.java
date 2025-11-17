class Solution {
    public int findKthLargest(int[] nums, int k) {
        int max = nums[0];
        int min = nums[0];
        for(int x: nums){
            if(x > max){
                max = x;
            }else if(x < min){
                min = x;
            }
        }
        int[] freq = new int[max-min+1];
        for(int x: nums){
            freq[x-min]++;
        }
        int count = 0;
        for(int i = freq.length-1; i >=0  ; i--){
            while(freq[i] > 0){
                count++;
                if(count == k){
                    return (i+min);
                }
             freq[i]--;   
            }
        }
        return -1;

    }
}