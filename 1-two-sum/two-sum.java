class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m1 = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int comp = target-nums[i];
            if(m1.containsKey(comp)){
                return new int[]{m1.get(comp),i};
            }
            m1.put(nums[i],i);
        }
        // for(int i = 0; i < nums.length-1; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         if(nums[i]+nums[j] == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        return new int[]{};
    }
}