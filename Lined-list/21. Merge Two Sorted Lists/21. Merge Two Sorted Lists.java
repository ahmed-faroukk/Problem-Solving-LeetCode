/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode base = new ListNode();
        ListNode finalList = base;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                finalList.next = list1;
                list1 = list1.next;

            } else {

                finalList.next = list2;
                list2 = list2.next;

            }
            finalList = finalList.next;

        }

        // to get last element 
        if (list1 != null)
            finalList.next = list1;
        if (list2 != null)
            finalList.next = list2;

        return base.next;


    }
}
