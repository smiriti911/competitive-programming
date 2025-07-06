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
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root==null){
            return 0;
        }

        int diameter1=maxDepth(root.left)+maxDepth(root.right);
        int dia2=diameterOfBinaryTree(root.left);
        int dia3=diameterOfBinaryTree(root.right);

         return Math.max(diameter1, Math.max(dia2, dia3));
    }

    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }

        int left=maxDepth(root.left);

        int right=maxDepth(root.right);

        return 1+ Math.max(left, right);
    }
}