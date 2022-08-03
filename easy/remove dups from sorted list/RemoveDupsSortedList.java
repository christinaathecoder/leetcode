/**
 * @author christinaathecoder
 * runtime: 0ms
 */

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
class RemoveDupsSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode h = head;
        while (h != null && h.next != null)   {
            if (h.val == h.next.val)    {
                h.next = h.next.next;
            }
            else    {
                h = h.next;
            }
        }
        return head;
    }
}
