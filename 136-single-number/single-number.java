class Solution {
    public int singleNumber(int[] nums) {
        // int result = 0;
        // for(int a:nums){
        //     result ^= a;
        // }
        // return result;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int x : nums){
            if(x < min){
                min = x;
            }
            if(x > max){
                max = x;
            }
        }
        int[] freq = new int[max-min+1];
        for(int x: nums){
            freq[x-min]++;
        }

        for(int i = 0; i < freq.length; i++){
            if(freq[i] == 1){
                return i+min;
            }
        }
        return -1;
    }
}