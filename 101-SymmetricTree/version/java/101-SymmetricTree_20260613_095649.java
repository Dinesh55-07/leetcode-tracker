// Last updated: 13/06/2026, 09:56:49
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
17    public boolean isSymmetric(TreeNode root) {
18        if (root == null) return true;
19
20        return Mirror(root.left, root.right);
21    }
22
23    public boolean Mirror(TreeNode tree1, TreeNode tree2){
24        if(tree1 == null && tree2 == null) return true;
25
26        if (tree1 == null || tree2 == null) return false;
27
28        return (tree1.val == tree2.val) && Mirror(tree1.left, tree2.right) && Mirror(tree1.right, tree2.left);
29    }
30}