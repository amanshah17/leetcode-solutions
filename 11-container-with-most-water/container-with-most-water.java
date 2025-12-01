class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int areaMax = 0;
        while(left < right){
            int w = right-left;
            int area ;
            if(height[left] <= height[right]){
               area =w * height[left++];
            }else{
                area = w * height[right--];
            }
            if(area > areaMax){
                areaMax = area;
            }
        }
        return areaMax;
    }
}