class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = firstIndex(nums,target);
        ans[1] = lastIndex(nums,target);

        return ans;
    }
    private int firstIndex(int[] nums, int target){
        int start = 0; int end = nums.length-1;
        int index = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            
            if(nums[mid] >= target){
                end = mid-1;
            }else{
                start = mid+1;
            }
            if(nums[mid] == target){
              index = mid;
            }
        }
        return index;
    }
    private int lastIndex(int[] nums, int target){
        int start = 0; int end = nums.length-1;
        int index = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            
            if(nums[mid] <= target){
                start = mid+1;
            }else{
                end = mid-1;
            }
            if(nums[mid] == target){
              index = mid;
            }
        }
        return index;
    }
}
