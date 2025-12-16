class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      Set<Integer> set = new HashSet<>();
      for(int num:nums1){
        set.add(num);
      }
       Set<Integer> intersections = new HashSet<>();
       for(int num : nums2){
        if(set.contains(num)){
            intersections.add(num);
        }
       }
       int[] arr = new int[intersections.size()];
       int i = 0;
       for(int n :  intersections){
        arr[i++] = n;
       }
       return arr;
    }
}