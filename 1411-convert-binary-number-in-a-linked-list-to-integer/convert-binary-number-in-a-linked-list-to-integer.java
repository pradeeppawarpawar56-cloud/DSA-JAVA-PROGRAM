 class Solution {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        
        while (head != null) {
            // Shift the current result left by 1 (multiply by 2) and add the current bit
            result = (result << 1) | head.val;
            head = head.next;
        }
        
        return result;
    }
}