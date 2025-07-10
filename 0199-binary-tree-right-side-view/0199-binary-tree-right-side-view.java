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
        Queue<TreeNode> q= new LinkedList<>();

        List<Integer> list= new ArrayList<>();

        q.add(root);

        if(root==null){
            return list;
        }

        while(!q.isEmpty()){
            int level=q.size();
            TreeNode last=null;
            for(int i=0; i<level; i++){
                TreeNode node=q.poll();
                     last=node;
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            list.add(last.val);
        }
        return list;
    }
}