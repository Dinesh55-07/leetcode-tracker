// Last updated: 05/06/2026, 14:29:58
1class Solution {
2    public int longestConsecutive(int[] nums) {
3
4        int n = nums.length;
5        if (n == 0) return 0;
6        int longestLength = 1;
7
8        Set<Integer> set = new HashSet<>();
9        for (int i = 0; i < n; i++) {
10            set.add(nums[i]);
11        }
12
13        for (int i : set) {
14            if (!set.contains(i - 1)) {
15                int count = 1;
16                int x = i;
17                while (set.contains(x + 1)) {
18                    x++;
19                    count++;
20                }
21                longestLength = Math.max(count, longestLength);
22            }
23        }
24
25        return longestLength;
26    }
27}