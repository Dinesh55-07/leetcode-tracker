// Last updated: 12/06/2026, 10:20:56
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public int rangeSumBST(TreeNode root, int low, int high) {
18        if (root == null){
19            return 0;
20        }
21
22        if(root.val >= low && root.val <= high){
23            return root.val+rangeSumBST(root.left, low, high)+ rangeSumBST(root.right, low, high);
24        }
25        else if(root.val < low){
26            return rangeSumBST(root.right, low, high);
27        }
28        else{
29            return rangeSumBST(root.left, low, high);
30        }
31    }
32}