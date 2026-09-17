 class Solution {
    public int countDigits(int num) {
        int original = num;
        int count = 0;
        
        while (num > 0) {
            int digit = num % 10;
            // Since the problem guarantees num contains no 0 digits, 'digit' will never be 0
            if (original % digit == 0) {
                count++;
            }
            num /= 10;
        }
        
        return count;
    }
}