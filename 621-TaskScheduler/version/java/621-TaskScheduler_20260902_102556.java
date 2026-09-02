// Last updated: 02/09/2026, 10:25:56
1class Solution {
2    public int leastInterval(char[] tasks, int n) {
3        int[] freq = new int[26];
4
5        // Count frequency of each task
6        for (char task : tasks) {
7            freq[task - 'A']++;
8        }
9
10        // Find maximum frequency
11        int maxFreq = 0;
12        for (int count : freq) {
13            maxFreq = Math.max(maxFreq, count);
14        }
15
16        // Count how many tasks have maximum frequency
17        int maxFreqTasks = 0;
18        for (int count : freq) {
19            if (count == maxFreq) {
20                maxFreqTasks++;
21            }
22        }
23
24        // Minimum length forced by the most frequent tasks
25        int skeleton = (maxFreq - 1) * (n + 1) + maxFreqTasks;
26
27        // Either the skeleton forces idle time,
28        // or we can fill everything with actual tasks.
29        return Math.max(tasks.length, skeleton);
30    }
31}
32