class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int result = 0, i = 0, j = 0;
        Map<Integer, Integer> freq = new HashMap<>();
                
        while (j < nums.length) {
            freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            while (i <= j && freq.get(nums[j]) > k) {
                freq.put(nums[i], freq.get(nums[i]) -1);
                if (freq.get(nums[i]) == 0) {
                    freq.remove(nums[i]);
                }
                i++;
            }            
            result = Math.max(result, j++ - i + 1);
        }        
        return result;   
    }
}