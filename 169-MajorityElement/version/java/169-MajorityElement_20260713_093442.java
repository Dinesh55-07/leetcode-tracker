// Last updated: 13/07/2026, 09:34:42
1class Solution {
2    public int majorityElement(int[] nums) {
3        int n = nums.length;
4        Map<Integer,Integer> map = new HashMap<>();
5
6        for (int i=0; i<n; i++){
7            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
8        }
9
10        n = n/2;
11
12        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
13            if(entry.getValue() > n){
14                return entry.getKey();
15            }
16        }
17
18        return 0;
19    }
20}