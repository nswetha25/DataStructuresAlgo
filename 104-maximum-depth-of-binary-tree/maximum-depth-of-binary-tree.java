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
    public int maxDepth(TreeNode root) {

//instead of trying recursive method lets try iterative method
    //    if(root==null) return 0;

    //    int left=maxDepth(root.left);
    //    System.out.println("left"+left);
    //    int right=maxDepth(root.right);
    //    System.out.println("left"+left);
    //    return 1+Math.max(left,right);

    //Lets try iterative method below: We can use either stack or queue depending on the scenario

    //For iterative method we can use level order traversal to find the height of binary tree
          
          if(root==null) return 0;
          //Lets create an empty queue for level order traversal

          Queue<TreeNode> q=new LinkedList<>();

          //First add the root node to queue and initialize height

          q.add(root);
          int depth=0;

          while(!q.isEmpty()){
            int size=q.size();

            for(int i=0;i<size;i++){
                TreeNode current=q.poll();

            // Add children of the current node to the queue
                if (current.left != null) {
                    q.offer(current.left);
                }
                if (current.right != null) {
                    q.offer(current.right);
                }
            }
            depth++;
          }
          return depth;
    }

          }

         

        
    
