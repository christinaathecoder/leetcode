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
/**
 * @author christinaadanks
 */
class MergeSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode start = new ListNode(0);
        
        ListNode n = start;
        ListNode n1 = l1;
        ListNode n2 = l2;
        while (n1 != null && n2 != null)    {
            if (n1.val < n2.val)    {
                n.next = n1;
                n1 = n1.next;
            }
            else    {
                n.next = n2;
                n2 = n2.next;
            }
            n = n.next;
        }
        if (n1 != null) {
            n.next = n1;
        }
        if (n2 != null) {
            n.next = n2;
        }
        return start.next;
    }
}
