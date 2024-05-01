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
    public TreeNode searchBST(TreeNode root, int val) {
        //https://www.youtube.com/watch?v=sE8q8RSW71Y
        
       if(root==null) return null;

       if(root.val==val) return root;

       if(val<root.val){
        return searchBST(root.left,val);
       }
       else{
        return searchBST(root.right,val);
       }

       

    }
}