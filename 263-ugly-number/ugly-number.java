class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
    public boolean isUgly(int n) {
       if (n <= 0) return false;
        while (n != 1) {
            int g = gcd(n, 30);
            if (g == 1) return false;
            n /= g;
        }
        return true;
    }
}