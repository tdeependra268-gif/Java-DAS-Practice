class Solution {
    public void reverseString(char[] s) {
        int slen = s.length; 
         char s2 [] = new char[slen];
         int index = 0 ;
        for(int i = slen-1 ; i >=0 ; i--){
           s2[index++] = s[i];
        }
        for (int i = 0; i <slen; i++) {
             s[i] = s2[i];
          }
    }
}

