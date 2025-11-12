class Solution {
    public int thirdMax(int[] arr) {
    long first = Long.MIN_VALUE;
    long second = Long.MIN_VALUE;
    long third = Long.MIN_VALUE;

    for (int num : arr) {
        long val = num;
        if (val == first || val == second || val == third) continue; 

        if (val > first) {
            third = second;
            second = first;
            first = val;
        } else if (val > second) {
            third = second;
            second = val;
        } else if (val > third) {
            third = val;
        }
    }
    return third == Long.MIN_VALUE ? (int) first : (int) third;
    }
}