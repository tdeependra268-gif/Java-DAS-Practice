class Solution {
  
    public TreeNode merge(TreeNode root1 , TreeNode root2 ){
        if(root1 == null && root2 == null ){
            return null ;
        }
           TreeNode node = null ;
         if(root1 != null && root2 == null  ){
            node = new TreeNode(root1.val);
            node.left = root1.left ;
            node.right = root1.right;
        }
        else if(root1 == null && root2 != null ){
             node = new TreeNode(root2.val);
               node.left = root2.left ; 
               node.right= root2.right ;
        }
        else  {
            int sum = root1.val + root2.val;
            node = new TreeNode(sum);
             node.left =   merge(root1.left , root2.left);
             node.right=  merge(root1.right , root2.right);
        }

        return node ;
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        
        return merge(root1 , root2 );
    }
}
