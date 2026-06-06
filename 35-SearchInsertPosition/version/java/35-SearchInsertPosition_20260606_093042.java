// Last updated: 06/06/2026, 09:30:42
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int left =0;
4        int right = nums.length -1;
5
6        while (left <= right){
7            int mid = left + (right - left)/2;
8
9            if (nums[mid] == target) return mid;
10            else if(nums[mid] < target){
11                left = mid + 1;
12            }else{
13                right = mid - 1;
14            }
15        }
16        return left;
17    }
18}