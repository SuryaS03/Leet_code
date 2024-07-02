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

public static void bfs(TreeNode root,ArrayList<Integer> li){

if(root.left==null && root.right==null && root!=null)
li.add(root.val);


if(root.left!=null)
bfs(root.left,li);

if(root.right!=null)
bfs(root.right,li);



}

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        ArrayList <Integer> li=new ArrayList<>();
        ArrayList <Integer> l2=new ArrayList<>();
        if(root1==root2)
        return true;
       bfs(root1,li);
        bfs(root2,l2);
        if(li.size()!=l2.size())
return false;

return Arrays.equals(li.toArray(),l2.toArray());
        
    }
}