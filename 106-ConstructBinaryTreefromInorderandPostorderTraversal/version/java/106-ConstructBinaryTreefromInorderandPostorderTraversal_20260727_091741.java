// Last updated: 27/07/2026, 09:17:41
1class Solution {
2    public TreeNode buildTree(int[] inorder, int[] postorder) {
3        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
4    }
5    
6    private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
7        if (inStart > inEnd || postStart > postEnd) {
8            return null;
9        }
10        
11        int rootVal = postorder[postEnd];
12        TreeNode root = new TreeNode(rootVal);
13        
14        int rootIndex = 0;
15        for (int i = inStart; i <= inEnd; i++) {
16            if (inorder[i] == rootVal) {
17                rootIndex = i;
18                break;
19            }
20        }
21        
22        int leftSize = rootIndex - inStart;
23        int rightSize = inEnd - rootIndex;
24        root.left = buildTree(inorder, inStart, rootIndex - 1, postorder, postStart, postStart + leftSize - 1);
25        root.right = buildTree(inorder, rootIndex + 1, inEnd, postorder, postEnd - rightSize, postEnd - 1);
26        
27        return root;
28    }
29}
30