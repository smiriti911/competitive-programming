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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        Deque<Integer> d= new LinkedList<>();
        if(root==null){
            return 0;
        }

        q.add(root);
        d.add(1);

        int max=0;
        while(!q.isEmpty()){
            int n= q.size();

            for(int i =0; i<n; i++){
                TreeNode node= q.poll();
                int index=d.removeFirst();

                if(node.left!=null){
                    q.offer(node.left);
                    d.addLast(2*index);
                }
                if(node.right!=null){
                    q.offer(node.right);
                    d.addLast(2*index+1);
                }
            }
            int newMax=1;
            if(d.size()>1){
                newMax= d.peekLast()-d.peekFirst()+1;
            }

            if(newMax>max){
                max=newMax;
            }
        }

        return max;
    }
}