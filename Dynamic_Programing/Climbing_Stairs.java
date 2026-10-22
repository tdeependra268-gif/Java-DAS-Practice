class Solution {
    public int climbStairs(int n) {
      
        int stap1 = 0 ;
        int stap2 = 1 ;
        for(int i = 1 ; i <= n ; i++ ){
             int temp = stap2 ;
             int tem = stap2+stap1 ;
             stap1 = temp ;
             stap2 = tem ;

        }
        return stap2 ;
    }
}
