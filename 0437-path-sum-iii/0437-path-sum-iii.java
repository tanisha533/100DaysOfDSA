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
    public int pathSum(TreeNode root, int targetSum) {
            if(root==null) return 0;

        return dfs(root,0,targetSum)+
               pathSum(root.left,targetSum)+
               pathSum(root.right,targetSum);   
    }
    public int dfs(TreeNode root, long cs, int targetSum) {
    if(root==null) return 0;
        cs+=root.val;
    int count= (cs==targetSum) ? 1:0;
    return count+dfs(root.left,cs,targetSum)
           +dfs(root.right,cs,targetSum);
    }
}