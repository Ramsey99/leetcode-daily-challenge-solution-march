class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int min = Integer.MAX_VALUE;
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                min = Math.min(min, nums1[i]);
                i++;
                j++;
            }
        }
        
        return min == Integer.MAX_VALUE ? -1 : min;       
    }
}