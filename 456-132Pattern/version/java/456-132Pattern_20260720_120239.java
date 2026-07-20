// Last updated: 20/07/2026, 12:02:39
1class Solution {
2    public boolean find132pattern(int[] nums) {
3        int secondMax = Integer.MIN_VALUE;
4
5        Stack<Integer> stack = new Stack<>();
6        for(int i=nums.length-1; i>=0; i--){
7            if(nums[i] < secondMax){
8                return true;
9            }
10
11            while(!stack.isEmpty() && nums[i] > stack.peek()){
12                secondMax = Math.max(secondMax, stack.pop());
13            }
14            stack.push(nums[i]);
15        }
16        return false;
17    }
18}