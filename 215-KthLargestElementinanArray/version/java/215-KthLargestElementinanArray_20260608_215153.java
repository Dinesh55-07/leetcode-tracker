// Last updated: 08/06/2026, 21:51:53
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> heap = new PriorityQueue<>();
4
5        for (int num : nums){
6            heap.offer(num);
7
8            if ( heap.size() > k ){
9                heap.poll();
10            }
11        }
12
13        return heap.peek();
14    }
15}