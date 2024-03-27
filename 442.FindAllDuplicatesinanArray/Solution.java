class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int j = Math.abs(nums[i]) - 1;
            if (nums[j] < 0) {
                result.add(Math.abs(nums[i]));
            } else {
                nums[j] = -nums[j];
            }
        }       
        return result;   
    }
}