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

public static void bfs(TreeNode root,HashSet<Integer>hs){
if(root==null)
return;
    bfs(root.left,hs);
    hs.add(root.val);
    bfs(root.right,hs);
}


    public int findSecondMinimumValue(TreeNode root) {

HashSet <Integer>hs=new HashSet<>();
bfs(root,hs);
List<Integer> list = new ArrayList<Integer>(hs); 
        Collections.sort(list); 
        if(list.size()>1)
        return list.get(1);
        return -1;

        
    }
}