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
    public static int res;
public static int height(TreeNode root){
    if(root==null)
    return 0;
    int l=height(root.left);
    int r=height(root.right);
    int count=Math.max(l,r)+1;
    res=Math.max(res,l+r);
    return count;
}

    public static int diafun(TreeNode root){
        res=0;
       height(root);
        return res;
    }



    public int diameterOfBinaryTree(TreeNode root) {
       return diafun(root);
    }
}