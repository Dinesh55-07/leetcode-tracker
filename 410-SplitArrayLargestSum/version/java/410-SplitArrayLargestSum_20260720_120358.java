// Last updated: 20/07/2026, 12:03:58
1class Solution {
2
3    public boolean canFit(int[] nums, int perK, int k){
4        int count = 1;
5        int sum = 0;
6        for(int num : nums){
7            if((sum+num)>perK){
8                count++;
9                sum = num;
10            }
11            else{
12                sum += num;
13            }
14        }
15        return count <= k;
16    }
17
18    public int splitArray(int[] nums, int k) {
19        int n = nums.length;
20        int min = Integer.MIN_VALUE;
21        int max = 0;
22        if(n < k){
23            return 0;
24        }
25        for(int num : nums){
26            min = Math.max(min, num);
27            max += num;
28        }
29
30        int soln = 0;
31        while(min <= max){
32            int mid = min + (max-min)/2;
33            if(canFit(nums, mid, k)){
34                soln = mid;
35                max = mid-1;
36            }
37            else{
38                min = mid + 1;
39            }
40        }
41
42        return soln;
43    }
44}