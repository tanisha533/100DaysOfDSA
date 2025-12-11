/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
         List<Integer> inorder = new ArrayList<>();
        
        // Step 1: Get complete inorder
        getInorder(root, inorder);
        
        // Step 2: Return k-1 index (0-based indexing)
        return inorder.get(k - 1);
    }
    
    private void getInorder(TreeNode node, List<Integer> inorder) {
        if (node == null) {
            return;
        }
        
        getInorder(node.left, inorder);   // Left
        inorder.add(node.val);             // Root
        getInorder(node.right, inorder);   // Right
  
    }
}