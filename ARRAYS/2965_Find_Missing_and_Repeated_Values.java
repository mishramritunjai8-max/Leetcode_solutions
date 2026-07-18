class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       int n = grid.length;
        // Total elements in an n x n grid is n * n
        int totalElements = n * n;
        int[] freq = new int[totalElements + 1];
        
        // Traverse the 2D grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];
                freq[num]++;
            }
        }
        
        int repeating = -1;
        int missing = -1;
        
        // The numbers range from 1 to n^2
        for (int i = 1; i <= totalElements; i++) {
            if (freq[i] == 2) {
                repeating = i;
            }
            if (freq[i] == 0) {
                missing = i;
            }
        }
        
        return new int[]{repeating, missing};
    }
}

