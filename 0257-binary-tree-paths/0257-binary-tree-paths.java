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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> result = new ArrayList<>();
        // Edge case: empty tree
        if (root == null) {
            return result;
        }

        // Start the recursive helper with initial path
        helper(root, "", result);

        return result;
    }

    private void helper(TreeNode node, String currPath, List<String> result){
       if(currPath.isEmpty()){
        currPath= ""+ node.val; 
       }
       else{
        currPath = currPath + "->" + node.val;
       }
      // If Leaf node? Path complete!
      if (node.left == null && node.right == null) {
        result.add(currPath);
        return; }
       // Left जाओ (अगर है तो)
      if (node.left != null) {
        helper(node.left, currPath, result);
    }
    
    // Right जाओ (अगर है तो)
    if (node.right != null) {
        helper(node.right, currPath, result);
    }


}
}