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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        TreeNode curr = root;
        while(curr != null){
            if(curr.left == null){
                ans.add(curr.val);
                curr = curr.right;
            }
            else{
                TreeNode rightMost = findLeftSubtreeRightMostNode(curr.left, curr);
                if(rightMost.right == null){
                    rightMost.right = curr;
                    curr = curr.left;
                }
                else{
                    rightMost.right = null;
                    ans.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        return ans;
    }
    public TreeNode findLeftSubtreeRightMostNode(TreeNode left, TreeNode curr){
        while (left.right != null && left.right != curr) {
            left = left.right;
        }
        return left;
    }
}