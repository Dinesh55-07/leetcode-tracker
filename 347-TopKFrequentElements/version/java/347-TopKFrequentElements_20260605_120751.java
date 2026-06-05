// Last updated: 05/06/2026, 12:07:51
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        Map<Integer,Integer> map = new HashMap<>();
4
5        for (int num : nums){
6            map.put(num,map.getOrDefault(num,0)+1);
7        }
8
9        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
10
11        for (int key : map.keySet()){
12            heap.add(key);
13        }
14
15        int res[] = new int[k];
16        for (int i=0; i<k; i++){
17            res[i] = heap.poll();
18        }
19        return res;
20    }
21}