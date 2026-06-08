// Last updated: 08/06/2026, 22:14:32
1class Solution {
2    public void sortColors(int[] nums) {
3        int low = 0;
4        int mid = 0;
5        int high = nums.length-1;
6
7        while (mid <= high){
8            if(nums[mid] == 0){
9                swap(nums,low,mid);
10                low++;
11                mid++;
12            }
13            else if(nums[mid] == 1){
14                mid++;
15            }
16            else{
17                swap(nums,mid,high);
18                high--;
19            }
20        }
21    }
22    public void swap(int nums[], int i, int j){
23        int temp = nums[i];
24        nums[i] = nums[j];
25        nums[j] = temp;
26    }
27}