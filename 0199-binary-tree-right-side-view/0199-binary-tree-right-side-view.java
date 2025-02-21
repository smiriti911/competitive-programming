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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        q.add(root);

        while(!q.isEmpty()){
            int level=q.size();
            TreeNode last=null;
            for(int i=0; i<level; i++){
                TreeNode node=q.poll();
                last=node;

                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            list.add(last.val);
        }
        return list;
    }
}