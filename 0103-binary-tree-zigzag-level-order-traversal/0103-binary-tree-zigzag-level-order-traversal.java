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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list= new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();

        int lvl=1;
        q.add(root);

        if(root==null){
            return list;
        }

        while(!q.isEmpty()){
          List<Integer> sublist= new ArrayList<>();
          
          int n=q.size();

          for(int i =0; i<n; i++){

            TreeNode node= q.remove();
            if(lvl%2==0){
               
             sublist.addFirst(node.val);

            }else{
                sublist.addLast(node.val);
            }

            if(node.left!=null){
                q.add(node.left);
            }

            if(node.right!=null){
                q.add(node.right);
            }
          }
          lvl++;
          list.add(sublist);
        }

        return list;
    }
}