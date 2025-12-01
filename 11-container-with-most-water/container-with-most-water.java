class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int areaMax = 0;
        while(left < right){
            int w = right-left;
            int h = height[0];
            int area ;
            if(height[left] <= height[right]){
               h = height[left++];
            }else{
                h = height[right--];
            }
            area = w * h;
            if(area > areaMax){
                areaMax = area;
            }
        }
        return areaMax;
    }
}