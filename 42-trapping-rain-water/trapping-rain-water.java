class Solution {
    public int trap(int[] height) {
      int start = 0;
      int end = height.length-1;
      int water = 0;
      int startMax = height[start];
      int endMax = height[end];
      while(start < end){
        if(height[start] <= height[end]){
            if(startMax < height[start]){
                startMax = height[start];
            }else{
                water = water + startMax - height[start];
            }
            start++;
        }else{
             if(endMax < height[end]){
                endMax = height[end];
            }else{
                water = water + endMax - height[end];
            }
            end--;
        }
       }
     return water;
    }
}