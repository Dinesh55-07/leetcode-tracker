// Last updated: 12/06/2026, 14:02:40
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
17    public int minDiffInBST(TreeNode root) {
18        List<Integer> ans= new ArrayList<>();
19
20        inorder(root,ans);
21
22        int min = Integer.MAX_VALUE;
23        for (int i=1; i<ans.size(); i++){
24            min = Math.min(ans.get(i) - ans.get(i-1), min);
25        }
26        return min;
27    }
28
29    public void inorder(TreeNode root, List<Integer> ans){
30        if (root == null) return;
31
32        inorder(root.left, ans);
33        ans.add(root.val);
34        inorder(root.right, ans);
35    }
36}