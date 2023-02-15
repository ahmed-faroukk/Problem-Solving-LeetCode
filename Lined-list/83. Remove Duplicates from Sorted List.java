/**
 * Definition for singly-linked list.
 * public class ListNe {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode Node = head ;
        if(Node==null){
            return null ;
        }
        while(Node.next!=null){
                 if(Node.val == Node.next.val){
                     // the next pointer for the current node to assin after duplicated 
                     Node.next = Node.next.next ;
        }else{

            //current node pointer to the next node 
            Node = Node.next ;
        }
      
        }
        return head ;

    }
}
