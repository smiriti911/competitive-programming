/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<Integer> pathP = dfs(root, new ArrayList<>(), p);
        List<Integer> pathQ = dfs(root, new ArrayList<>(), q);

        int lastCommon = root.val; // fallback to root
        int minLen = Math.min(pathP.size(), pathQ.size());

        for (int i = 0; i < minLen; i++) {
            if (pathP.get(i).equals(pathQ.get(i))) {
                lastCommon = pathP.get(i);
            } else {
                break;
            }
        }

        return new TreeNode(lastCommon); // returns new TreeNode with correct val
    }

    public List<Integer> dfs(TreeNode root, List<Integer> path, TreeNode node) {
        if (root == null) return null;

        path.add(root.val);

        if (root == node) {
            return new ArrayList<>(path); // return copy of path
        }

        List<Integer> left = dfs(root.left, path, node);
        if (left != null) return left;

        List<Integer> right = dfs(root.right, path, node);
        if (right != null) return right;

        path.remove(path.size() - 1); // backtrack
        return null;
    }
}
