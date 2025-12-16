class Solution {
    public boolean isThree(int n) {
      int i = 1;
      int count = 1;
      while(i <= n/2){
        if(n % i == 0){
            count++;
        }
        i++;
      }
      return count == 3;
    }
    // private boolean isPrime(int num) {
    //     if (num <= 1) return false;

    //     int i = 2;
    //     while (i <= Math.sqrt(num)) {
    //         if (num % i == 0) {
    //             return false;
    //         }
    //         i++;
    //     }

    //     return true;
    // }
}