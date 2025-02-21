/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        q.add(root);
         int lvl=1;
        while (!q.isEmpty()) {
            List<Integer> sublist = new ArrayList<>();
            int level = q.size();
       
            for (int i = 0; i < level; i++) {
                TreeNode node = q.remove();
                if(lvl%2==0){
                   sublist.addFirst(node.val);
                }
                else{
                    sublist.addLast(node.val);
                }
                

                if (node.left != null) {
                    q.add(node.left);
                }
                
                if (node.right != null) {
                    q.add(node.right);
                }

            }
            result.add(sublist);
            lvl++;

        }
        return result;
    }
}