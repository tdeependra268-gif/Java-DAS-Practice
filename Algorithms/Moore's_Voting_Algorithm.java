class Solution {
    public int majorityElement(int[] nums) {
 
      
          int ans = 0 ;
          int fre = 0 ;

       for(int i = 0 ; i < nums.length ; i++ ){
           if(fre == 0 ){
            ans = nums[i];
           }

           if(nums[i] == ans ) fre++;
           else fre--;
       }

    
        return ans ;
    }
}
