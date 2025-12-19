class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    private void mergeSort(int[] arr, int start,int end){
        if(start < end){
            int mid = start+(end-start)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    private void merge(int[] arr, int start, int mid, int end){
        int[] mergeArr = new int[end-start+1];
        int idx1 = start, idx2 = mid+1, idx3 = 0;
        while(idx1 <= mid && idx2 <= end){
            if(arr[idx1] < arr[idx2]){
                mergeArr[idx3++] = arr[idx1++];
            }else{
                mergeArr[idx3++] = arr[idx2++];
            }
        }
        while(idx1 <= mid){
            mergeArr[idx3++] = arr[idx1++];
        }
        while(idx2 <= end){
            mergeArr[idx3++] = arr[idx2++];
        }
        for(int i = start,j = 0;j < mergeArr.length; i++,j++){
            arr[i] = mergeArr[j];
        }
    }
}