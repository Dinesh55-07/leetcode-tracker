// Last updated: 14/02/2026, 14:41:59
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int j = 0;
4        for (int i=0; i<nums.length ; i++){
5            if(nums[i] != 0){
6                int temp = nums[i];
7                nums[i] = nums[j];
8                nums[j] = temp;
9
10                j++;
11            }
12        }
13        
14    }
15}