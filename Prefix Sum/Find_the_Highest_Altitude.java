class Solution {
    public int largestAltitude(int[] gain) {

        int maxhight = 0 ;
        int current = 0 ;
        for(int i = 0 ; i < gain.length; i++){
            current = current + gain[i];
            maxhight = Math.max(current , maxhight);
        }
        return maxhight ;
    }
}
