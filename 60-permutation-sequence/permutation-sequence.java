class Solution {
   public String getPermutation(int n, int k) {
    List<Integer> num = new ArrayList<>();
    int[] fact = new int[n+1];
    fact[0] = 1;
    for (int i = 1; i <= n; i++) {
        fact[i] = fact[i-1] * i;
        num.add(i);
    }
    k--;
    StringBuilder str = new StringBuilder();
    for (int i = n; i >= 1; i--) {
        int idx = k / fact[i-1];
        str.append(num.get(idx));
        num.remove(idx);
        k = k % fact[i-1];
    }

    return str.toString();
   }    
}