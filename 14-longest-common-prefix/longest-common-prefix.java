 class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Assume the first string is the longest common prefix initially
        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            // Check if the current string starts with the prefix.
            // If not, shorten the prefix from the end until it matches or becomes empty.
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}