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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        //Here first we will have two arrays that stores the leaf values of two trees. Then we will
        //use dfs to traverse and get the leaf values

        List<Integer> values1=new ArrayList<>();
        List<Integer> values2=new ArrayList<>();
        
        dfs(values1,root1);
        dfs(values2,root2);


        return values1.equals(values2);
        
    }

    private void dfs(List<Integer> leafvalues,TreeNode root){

        if(root==null) return;

        if(root.left==null && root.right==null) leafvalues.add(root.val);

        dfs(leafvalues,root.left);
        dfs(leafvalues,root.right);
    }
}