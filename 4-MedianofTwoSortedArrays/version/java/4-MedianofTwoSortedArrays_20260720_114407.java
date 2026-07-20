// Last updated: 20/07/2026, 11:44:07
1import java.util.Arrays;
2
3class Solution {
4    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
5        // Get the sizes of both input arrays.
6        int n = nums1.length;
7        int m = nums2.length;
8
9        // Merge the arrays into a single sorted array.
10        int[] merged = new int[n + m];
11        int k = 0;
12        for (int i = 0; i < n; i++) {
13            merged[k++] = nums1[i];
14        }
15        for (int i = 0; i < m; i++) {
16            merged[k++] = nums2[i];
17        }
18
19        // Sort the merged array.
20        Arrays.sort(merged);
21
22        // Calculate the total number of elements in the merged array.
23        int total = merged.length;
24
25        if (total % 2 == 1) {
26            // If the total number of elements is odd, return the middle element as the median.
27            return (double) merged[total / 2];
28        } else {
29            // If the total number of elements is even, calculate the average of the two middle elements as the median.
30            int middle1 = merged[total / 2 - 1];
31            int middle2 = merged[total / 2];
32            return ((double) middle1 + (double) middle2) / 2.0;
33        }
34    }
35}