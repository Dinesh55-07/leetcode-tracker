// Last updated: 08/06/2026, 21:38:00
1class Solution {
2    public int findMin(int[] nums) {
3        int min = nums[0];
4        
5        for (int i=1; i<nums.length; i++){
6            if (nums[i] < min){
7                min = nums[i];
8            }
9        }
10        return min;
11    }
12}