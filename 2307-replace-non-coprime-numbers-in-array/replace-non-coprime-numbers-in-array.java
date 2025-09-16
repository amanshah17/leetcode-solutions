class Solution {
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
     private static int lcm(int a, int b) {
        return (int)((long)a / gcd(a, b) * b);
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> stack = new ArrayList<>();
        for (int num : nums) {
            int current = num;
            while (!stack.isEmpty()) {
                int top = stack.get(stack.size() - 1);
                int g = gcd(top, current);
                if (g == 1) break;  
                stack.remove(stack.size() - 1); 
                current = lcm(top, current);
            }
            stack.add(current);
        }
        return stack;
    }
    
}