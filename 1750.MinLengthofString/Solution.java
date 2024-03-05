class Solution {
    public int minimumLength(String s) {
        int left = 0, right = s.length() - 1;
        
        while (left < right && s.charAt(left) == s.charAt(right)) {
            char charAtLeft = s.charAt(left);
            
            while (left <= right && s.charAt(left) == charAtLeft) {
                left++;
            }
            
            while (right >= left && s.charAt(right) == charAtLeft) {
                right--;
            }
        }
        
        return right - left + 1;
    }
}