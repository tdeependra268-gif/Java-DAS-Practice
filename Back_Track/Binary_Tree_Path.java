
class Solution {
    public void tree(TreeNode root , String str , List<String> ans ){
        if(root == null )    return ;
        else if(root.left == null && root.right == null ){
            str = str+root.val ;
            ans.add(str);
             return ;
        }

       String  str1 = root.val+"->";
          str =str+ str1;

        tree(root.left , str , ans  );

        tree(root.right , str , ans );

         str = str1 ;
    }

    public List<String> binaryTreePaths(TreeNode root) {
        String str ="";
      
        List<String> ans = new ArrayList<>();
        tree(root,str , ans );
          
          return ans ;

    }
}
