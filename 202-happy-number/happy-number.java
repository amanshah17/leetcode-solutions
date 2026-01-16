class Solution {
    public boolean isHappy(int n) {
        Set<Integer> x = new HashSet<>();

        while (n != 1) {
            if (x.contains(n)) {
                return false; 
            }
            x.add(n);
            n = getNext(n);
        }

        return true;
    }
    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}