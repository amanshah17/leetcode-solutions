class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0,digitSum = 0;
        for(int arr:nums){
            sum += arr;
            while(arr > 0){
                digitSum+=arr%10;
            arr/=10;
            }
        }
        return Math.abs(sum-digitSum);
    }
}