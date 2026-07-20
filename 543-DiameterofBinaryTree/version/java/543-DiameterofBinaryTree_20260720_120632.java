// Last updated: 20/07/2026, 12:06:32
1class Solution {
2    int res = 0;
3
4    public int diameterOfBinaryTree(TreeNode root) {
5        dfs(root);
6        return res;        
7    }
8
9    private int dfs(TreeNode root) {
10        if (root == null) {
11            return 0;
12        }
13
14        int l = dfs(root.left);
15        int r = dfs(root.right);
16
17        res = Math.max(res, l + r);
18
19        return 1 + Math.max(l, r);
20    }    
21}