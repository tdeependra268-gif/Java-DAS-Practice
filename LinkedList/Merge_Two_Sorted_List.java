/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode(0);
         ListNode current = newList ;
        ListNode tempList1 = list1 ;
        ListNode tempList2 = list2 ;

      
        while(tempList1 != null && tempList2 != null ){
             
                if( tempList1.val <=  tempList2.val){
                  current.next = new ListNode(tempList1.val);  
                  tempList1 = tempList1.next ;
                }
                else {
                 current.next = new ListNode(tempList2.val);  
                   tempList2 = tempList2.next ;
                }
                current = current.next;
        }
          if(tempList1 != null) {
                 current.next =  tempList1;
                 current = current.next;
            }
            else {
                current.next = tempList2; 
                current = current.next; 
            }
      
        return newList.next ;
    }
}
