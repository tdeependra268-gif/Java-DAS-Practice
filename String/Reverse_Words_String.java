class Solution {
    public String reverseWords(String s) {
      
        String st[] = s.split(" ");
      
         String result ="";
         for(int i = st.length-1 ; i>=0 ; i-- ){
            if(st[i].isBlank())  continue ;
             result = result+" "+st[i];
         }
         result = result.trim();
        return result;
    }
}
