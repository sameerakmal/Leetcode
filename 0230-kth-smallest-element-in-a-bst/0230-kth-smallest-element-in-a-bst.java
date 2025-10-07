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
    public int kthSmallest(TreeNode root, int k) {
        int cnt = 0;
        TreeNode curr = root;
        while(curr != null){
            if(curr.left == null){
                cnt++;
                if(cnt == k) return curr.val;
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
                    cnt++;
                    if (cnt == k) return curr.val;
                    curr = curr.right;
                }
            }
        }
        return -1;
    }
    public TreeNode findLeftSubtreeRightMostNode(TreeNode left, TreeNode curr){
        while (left.right != null && left.right != curr) {
            left = left.right;
        }
        return left;
    }
}