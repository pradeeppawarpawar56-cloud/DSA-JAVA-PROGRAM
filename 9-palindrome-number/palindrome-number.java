 class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending in 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }
        
        // If the number is palindrome, the original half (x) equals the reversed half,
        // or equals the reversed half divided by 10 (for numbers with odd digits like 12321).
        return x == reversedHalf || x == reversedHalf / 10;
    }
}