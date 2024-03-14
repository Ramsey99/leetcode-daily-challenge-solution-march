class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int prefixSum = 0, result = 0;
        Map<Integer, Integer> count = new HashMap<>();
        
        for (int i : nums) {
            count.put(prefixSum, count.getOrDefault(prefixSum, 0) + 1);
            prefixSum += i;
            result += count.getOrDefault(prefixSum - goal, 0);
        }
        return result;  
    }
}