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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
         if(subRoot==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root.val==subRoot.val){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }

        return isSubtree(root.left, subRoot)|| isSubtree(root.right, subRoot);
    }

    public boolean isIdentical(TreeNode p, TreeNode q){
        if(p==null && q==null){
            return true;
        }

        if(p==null|| q==null|| p.val!=q.val){
            return false;
        }
        return isIdentical(p.left, q.left)&& isIdentical(p.right, q.right);
    }
}