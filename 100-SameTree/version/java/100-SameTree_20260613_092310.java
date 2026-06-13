// Last updated: 13/06/2026, 09:23:10
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
17    public boolean isSameTree(TreeNode p, TreeNode q) {
18        if (p == null && q == null){
19            return true;
20        }
21        if (p == null || q == null || p.val!= q.val){
22            return false;
23        }
24
25        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
26    }
27}