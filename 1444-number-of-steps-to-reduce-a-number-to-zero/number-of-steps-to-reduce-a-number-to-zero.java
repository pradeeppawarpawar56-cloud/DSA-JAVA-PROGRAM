 class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        
        while (num > 0) {
            if ((num & 1) == 0) { // Check if even
                num >>= 1;       // Divide by 2
            } else {
                num -= 1;        // Subtract 1
            }
            steps++;
        }
        
        return steps;
    }
}