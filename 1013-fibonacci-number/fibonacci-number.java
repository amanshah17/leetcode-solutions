class Solution {
    public int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        int a = 0;
        int b = 1;
        int i = 2;
        while(i <= n){
           b = a+b;
           a = b-a;
           i++;
        }
        return b;
    }
}