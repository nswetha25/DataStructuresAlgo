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
    public List<Integer> rightSideView(TreeNode root) {
        
        //As we are supposed to get the right side element with each value we have to perform right side 
        //traversal- Order level traversal- Where we obtain the last value of that traversal

        //technically theyw ant all the right most nodes at each level so at the last level if they have only
        //one node that is on the left side they still want it

        //https://www.youtube.com/watch?v=xyHb_ghpXf4

        List<Integer> result=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();

        if(root==null) return result;

        queue.offer(root);

        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode current_node=queue.poll();
                if(i==0) result.add(current_node.val);
                if(current_node.right!=null) queue.offer(current_node.right);
                if(current_node.left!=null) queue.offer(current_node.left);

            }
        }

        return result;

        



        
    }
}