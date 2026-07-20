// Last updated: 20/07/2026, 12:10:19
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int windowSum = 0;
4
5        // first window
6        for (int i = 0; i < k; i++) {
7            windowSum += nums[i];
8        }
9
10        int maxSum = windowSum;
11
12        // slide the window
13        for (int i = k; i < nums.length; i++) {
14            windowSum += nums[i];        // add new element
15            windowSum -= nums[i - k];    // remove old element
16            maxSum = Math.max(maxSum, windowSum);
17        }
18
19        return (double) maxSum / k;
20    }
21}