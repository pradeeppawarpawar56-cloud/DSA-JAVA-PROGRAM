import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int minCol = 0;

            // Find minimum element in the row
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < matrix[i][minCol]) {
                    minCol = j;
                }
            }

            int num = matrix[i][minCol];
            boolean isLucky = true;

            // Check if it is maximum in its column
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minCol] > num) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                result.add(num);
            }
        }

        return result;
    }
}