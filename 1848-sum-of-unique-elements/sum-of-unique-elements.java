class Solution {
    public int sumOfUnique(int[] nums) {
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
         for(int x: nums) {
        	  freq[x-min]++;
        }
        int sum = 0;
        for(int i = 0; i < freq.length;i++){
            if(freq[i] == 1){
                sum += (i+min);
            }
        }
       return sum; 
    }
}