class Solution {
  
  
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
          
     int ans[] = new int[m+n];

       int num1P = 0 ;
       int num2P = 0 ;

       int index  = 0 ;
       while(num1P < m && num2P < n ){
           
           if(nums1[num1P] < nums2[num2P]){
            ans[index++] = nums1[num1P];
            num1P++;
           }
           else {
            ans[index++] = nums2[num2P];
            num2P++;
           }
       }   
       while(num1P < m ){
             ans[index++] = nums1[num1P];
               num1P++;
       }
       while(num2P < n ){
           ans[index++] = nums2[num2P];
             num2P++;
       }
       
      for(int i = 0 ; i <ans.length ; i++ ){
            nums1[i] = ans[i];
        }

    }
}
