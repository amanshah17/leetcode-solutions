class Solution {
    public int[] sortArray(int[] nums) {
       mergeSort(nums, 0, nums.length-1);
       return nums;
    }
    private void mergeSort(int[] nums, int start, int end){
        if(start < end){
            int mid = start + (end - start)/2;
            mergeSort(nums, start, mid);
            mergeSort(nums, mid+1, end);
            merge(nums, start, mid, end);
        }
    }
    private void merge(int[] nums, int start,int mid, int end){
        int[] mergedArr =  new int[end-start+1];
        int idx1 = start;
        int idx2 = mid+1;
        int idx3 = 0;

        while(idx1 <= mid && idx2 <= end){
            if(nums[idx1] < nums[idx2]){
                mergedArr[idx3++] = nums[idx1++];
            }else{
                mergedArr[idx3++] = nums[idx2++];
            }
        }
        while(idx1 <= mid){
             mergedArr[idx3++] = nums[idx1++];
        }
        while(idx2 <= end){
             mergedArr[idx3++] = nums[idx2++];
        }
        for(int i = start, j = 0; j < mergedArr.length; i++,j++){
            nums[i] = mergedArr[j];
        }
    }
}