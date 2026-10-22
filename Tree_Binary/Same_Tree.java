
class Solution {
    
      public  boolean   solve (TreeNode p ,  TreeNode q  ){
       if(p == null && q == null  ) return true ;
   else if(p != null && q == null ) return false ;
   else if(p == null && q != null ) return false ;
   else if(p.val != q.val ) return false ; 
  
           
       boolean isS = solve(p.left , q.left );
       boolean isB  = solve(p.right , q.right);
         if(isS && isB) return true ;
        return false ;
    }  

    public boolean isSameTree(TreeNode p, TreeNode q) {
      
        return   solve(p ,q )  ;
    }
}
