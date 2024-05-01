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
    public int maxLevelSum(TreeNode root) {

      

        Queue<TreeNode> q=new LinkedList<>();
        int maxsum=Integer.MIN_VALUE;
        
       int level=1;
        q.offer(root);
        int minlevel=-1;
        
        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;
            for(int i=0;i<size;i++){
                TreeNode current_node=q.poll();
                sum +=current_node.val;
                if(current_node.right!=null) q.offer(current_node.right);
                if(current_node.left!=null) q.offer(current_node.left);
            }
            if(maxsum<sum){
              maxsum=sum;
              minlevel=level;
            }
            level++;
        }
        return minlevel;
        
        //here we are just taking bfs strategey and then just taking the sum and returning the level
    }
}