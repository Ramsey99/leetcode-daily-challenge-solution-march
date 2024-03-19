class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] taskCount = new int[26]; 
        
        for (char task : tasks) {
            taskCount[task - 'A']++;
        }
        Arrays.sort(taskCount);
        int maxFreq = taskCount[25] -1;
        int maxCount = maxFreq * n;

        for (int i = 24; i >= 0 && taskCount[i] > 0; i--){
            maxCount -= Math.min(taskCount[i], maxFreq);
        }
        return maxCount > 0 ? maxCount + tasks.length : tasks.length;        
    }
}