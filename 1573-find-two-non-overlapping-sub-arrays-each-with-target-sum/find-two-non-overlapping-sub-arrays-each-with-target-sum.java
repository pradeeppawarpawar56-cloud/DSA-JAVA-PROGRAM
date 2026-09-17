import java.util.Arrays;

class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] minLenSoFar = new int[n];
        Arrays.fill(minLenSoFar, Integer.MAX_VALUE);
        
        int currentSum = 0;
        int left = 0;
        int minTotalLength = Integer.MAX_VALUE;
        int bestLen = Integer.MAX_VALUE;
        
        for (int right = 0; right < n; right++) {
            currentSum += arr[right];
            
            while (currentSum > target && left <= right) {
                currentSum -= arr[left];
                left++;
            }
            
            if (currentSum == target) {
                int currentLen = right - left + 1;
                
                if (left > 0 && minLenSoFar[left - 1] != Integer.MAX_VALUE) {
                    minTotalLength = Math.min(minTotalLength, currentLen + minLenSoFar[left - 1]);
                }
                
                bestLen = Math.min(bestLen, currentLen);
            }
            
            minLenSoFar[right] = bestLen;
        }
        
        return minTotalLength == Integer.MAX_VALUE ? -1 : minTotalLength;
    }
}
