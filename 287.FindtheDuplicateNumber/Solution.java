class Solution {
    public int findDuplicate(int[] nums) {
        int i = nums[0];
        int j = nums[0];
    
        do {
            i = nums[i];
            j = nums[nums[j]];
        } 
        while (i != j);    
        int res = nums[0];
        int curr = i;
    
        while (res != curr) {
            res = nums[res];
            curr = nums[curr];
        }
    
        return res;    
    }
}