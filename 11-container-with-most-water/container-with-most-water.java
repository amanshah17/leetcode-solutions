class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int areaMax = 0;
        while(start < end){
            int w = end-start;
            int area = 0 ;
            if(height[start] <= height[end]){
               area = w * height[start++];
            }else{
                area = w * height[end--];
            }
            if(area > areaMax){
                areaMax = area;
            }
        }
        return areaMax;
    }
}