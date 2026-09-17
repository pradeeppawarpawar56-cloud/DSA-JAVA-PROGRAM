 class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        int limit = Math.min(a, b);
        
        // Check every number from 1 up to the smaller of the two integers
        for (int i = 1; i <= limit; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        
        return count;
    }
}