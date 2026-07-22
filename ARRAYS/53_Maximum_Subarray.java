class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize with the first element to handle arrays with only negative numbers
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        // Start iterating from the second element
        for (int i = 1; i < nums.length; i++) {
            // Decide whether to add the current element to the existing subarray 
            // or start a brand new subarray from the current element
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            // Update the global maximum if the current subarray sum is larger
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}