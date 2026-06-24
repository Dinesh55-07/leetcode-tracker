// Last updated: 24/06/2026, 22:08:26
1class Solution {
2    public int findDuplicate(int[] nums) {
3        Set<Integer> set = new HashSet<>();
4        int len = nums.length;
5
6        for (int i = 0; i < len; i++){
7            if(!set.add(nums[i])){
8                return nums[i];
9            }
10        }
11        return len;
12    }
13}