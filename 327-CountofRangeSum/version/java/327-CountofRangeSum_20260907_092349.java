// Last updated: 07/09/2026, 09:23:49
1class Solution {
2    public int countRangeSum(int[] nums, int lower, int upper) {
3        long[] prefixSums = new long[nums.length + 1];
4        prefixSums[0] = 0;
5        for (int index = 0; index < nums.length; index++) {
6            prefixSums[index + 1] = prefixSums[index] + nums[index];
7        }
8
9        long[] sortedPrefixSums = prefixSums.clone();
10        Arrays.sort(sortedPrefixSums);
11        int rank = 0;
12        TreeMap<Long, Integer> ranks = new TreeMap<>();
13        for (int index = 0; index < sortedPrefixSums.length; index++) {
14            if (!ranks.containsKey(sortedPrefixSums[index])) {
15                ranks.put(sortedPrefixSums[index], rank++);
16            }
17        }
18
19        int count = 0;
20        SegmentTree tree = new SegmentTree(0, rank);
21        for (int index = prefixSums.length - 1; index >= 0; index--) {
22            Long lowerBound = ranks.floorKey(prefixSums[index] + lower - 1);
23            int minRank = -1;
24            if (lowerBound != null) {
25                minRank = ranks.get(lowerBound) + 1;
26            }
27            
28            Long upperBound = ranks.floorKey(prefixSums[index] + upper);
29            int maxRank = -1;
30            if (upperBound != null) {
31                maxRank = ranks.get(upperBound);
32            }
33            
34            count += tree.query(minRank, maxRank);
35            tree.update(ranks.get(prefixSums[index]));
36        }
37        
38        return count;
39    }
40
41    class SegmentTree {
42        private final int min;
43        private final int max;
44        private final int[] tree;
45
46        public SegmentTree(int min, int max) {
47            this.min = min;
48            this.max = max;
49            this.tree = new int[(max - min + 1) * 4];
50        }
51
52        public int query(int min, int max) {
53            return query(0, this.min, this.max, min, max);
54        }
55
56        private int query(int treeIndex, int lo, int hi, int min, int max) {
57            if (min > hi || max < lo || min > max) {
58                return 0;
59            } else if (min <= lo && max >= hi) {
60                return tree[treeIndex];
61            }
62            int mid = lo + (hi - lo) / 2;
63            if (max <= mid) {
64                return query(treeIndex * 2 + 1, lo, mid, min, max);
65            } else if (min > mid) {
66                return query(treeIndex * 2 + 2, mid + 1, hi, min, max);
67            }
68            int left = query(treeIndex * 2 + 1, lo, mid, min, mid);
69            int right = query(treeIndex * 2 + 2, mid + 1, hi, mid + 1, max);
70            return left + right;
71        }
72
73        public void update(int num) {
74            update(0, this.min, this.max, num);
75        }
76
77        private void update(int treeIndex, int lo, int hi, int num) {
78            if (lo == hi) {
79                tree[treeIndex] += 1;
80                return;
81            }
82            int mid = lo + (hi - lo) / 2;
83            if (num <= mid) {
84                update(treeIndex * 2 + 1, lo, mid, num);
85            } else {
86                update(treeIndex * 2 + 2, mid + 1, hi, num);
87            }
88            tree[treeIndex] = tree[treeIndex * 2 + 1] + tree[treeIndex * 2 + 2];
89        }
90    }
91}