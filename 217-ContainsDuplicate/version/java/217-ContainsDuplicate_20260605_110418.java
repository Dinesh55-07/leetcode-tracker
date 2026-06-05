// Last updated: 05/06/2026, 11:04:18
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        /*Arrays.sort(nums);
4        int n = nums.length;
5
6        for (int i=0; i<n-1; i++){
7            if (nums[i] == nums[i+1]){
8                return true;
9            }
10        }
11        return false;*/
12
13        Set<Integer> set = new HashSet<>();
14        int n = nums.length;
15
16        for (int num : nums){
17            set.add(num);
18        }
19
20        return set.size() < n;
21    }
22}