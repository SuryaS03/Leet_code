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

    public static void bfs(TreeNode root, ArrayList<Integer>li)
{

if(root==null)
return ;
bfs(root.left,li);
li.add(root.val);
bfs(root.right,li);

}


    public boolean findTarget(TreeNode root, int k) {

        ArrayList <Integer> li=new ArrayList<>();
        bfs(root,li);
        Collections.sort(li);
        int st=0;
        int lt=li.size()-1;
        while(st<lt)
        {
            if(li.get(st)+li.get(lt)==k)
            return true;
            if(li.get(st)+li.get(lt)>k)
            lt--;
            else
            st++;
        }
        return false;
        
    }
}