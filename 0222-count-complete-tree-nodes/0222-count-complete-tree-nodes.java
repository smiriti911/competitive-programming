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
    public int countNodes(TreeNode root) {
       int ans=helper(root)/2;
       return ans;
    }

    public int helper(TreeNode root){
       if(root==null){
            return 0;
        }

        int left=1+helper(root.left);
        int right=1+helper(root.right);

        return left+right ;
    }
}