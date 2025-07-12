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
   public TreeNode buildTree(int[] preorder, int[] inorder) {
        // Create a hashmap to store the indices of values in the inorder array
        Map<Integer,Integer> inMap = new HashMap<>();

        // Populate the hashmap with the indices of the values in the inorder array
        for(int i = 0; i < inorder.length; i++){
            inMap.put(inorder[i],i);
        }

        // Recursively build the tree using the preorder and inorder arrays
        TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inMap);

        // Return the root of the constructed tree
        return root;
    }



    public TreeNode buildTree(int preorder[],int preStart,int preEnd,int inorder[],int inStart,int inEnd,Map<Integer,Integer> inMap){
        
        // Base case: if the start index is greater than the end index for either array, return null
        if(preStart > preEnd || inStart > inEnd){
            return null;
        }

        // Create a new node with the value at the start index of the preorder array
        TreeNode root = new TreeNode(preorder[preStart]);

        // Find the index of the root value in the inorder array
        int inRoot = inMap.get(root.val);

        // Calculate the number of nodes in the left subtree
        int numsLeft = inRoot - inStart;

        // Recursively build the left subtree using the following parameters:
        // - preorder array: the start index is preStart + 1 because the first node in the preorder array is the root
        //   and has already been used to create the current node
        // - preorder array: the end index is preStart + numsLeft because the number of nodes in the left subtree is
        //   numsLeft, so the end index of the left subtree in the preorder array is preStart + numsLeft
        // - inorder array: the start index is inStart because the left subtree in the inorder array is to the left of
        //   the current root node
        // - inorder array: the end index is inRoot - 1 because the root node is in the middle of the inorder array,
        //   so the left subtree in the inorder array goes from inStart to inRoot - 1
        root.left = buildTree(preorder, preStart + 1, preStart + numsLeft,
                             inorder, inStart, inRoot - 1, inMap);

        // Recursively build the right subtree using the following parameters:
        // - preorder array: the start index is preStart + numsLeft + 1 because the nodes in the left subtree have
        //   already been used, so the start index of the right subtree is preStart + numsLeft + 1
        // - preorder array: the end index is preEnd because the last node in the preorder array is the root node
        // - inorder array: the start index is inRoot + 1 because the right subtree in the inorder array is to the right
        //   of the current root node
        // - inorder array: the end index is inEnd because the last node in the inorder array is the rightmost node
        root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd,
                             inorder, inRoot + 1, inEnd, inMap);

        // Return the root of the subtree
        return root;
    }
}