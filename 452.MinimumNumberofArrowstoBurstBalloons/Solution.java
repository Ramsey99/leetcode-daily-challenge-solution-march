class Solution {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int result = 1;
        int end = points[0][1]; 

        for (int[] point : points) {
            int start = point[0]; 

            if (start > end) {
                result++;
                end = point[1];
            }
        }

        return result;        
    }
}