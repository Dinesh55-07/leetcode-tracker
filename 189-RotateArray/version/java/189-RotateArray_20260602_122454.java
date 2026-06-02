// Last updated: 02/06/2026, 12:24:54
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n = nums.length;
4        k = k % n;
5
6        reverse(nums, 0, n-1);
7        reverse(nums, 0, k-1);
8        reverse(nums, k, n-1);
9    }
10    private void reverse(int num[], int left, int right){
11        while ( left < right )
12        {
13            int temp= num[left];
14            num[left]=num[right];
15            num[right]=temp;
16            left++;
17            right--;
18        }
19    }
20}