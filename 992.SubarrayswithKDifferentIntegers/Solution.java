class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int subMaxK = subarrayMostK(nums, k);
        int reduceMaxK = subarrayMostK(nums, k - 1);
        return subMaxK - reduceMaxK;
    }

    public int subarrayMostK ( int[] nums, int k){
        int i = 0, j = 0, result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        while (i < nums.length){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            while (map.size() > k) {
                map.put(nums[j], map.get(nums[j]) - 1);
                if (map.get(nums[j]) == 0){
                    map.remove(nums[j]);
                }
                j++;
            }
            result += i - j + 1;
            i++;
        }

        return result;    
    }
}