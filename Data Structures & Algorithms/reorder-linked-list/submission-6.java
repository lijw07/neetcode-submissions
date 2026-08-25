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
    public void reorderList(ListNode head) {
        
        //Determine the middle of the list
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //Reverse ListNode after Middle
        ListNode second = slow.next;
        ListNode reverse = slow.next = null;

        while (second != null) {
            ListNode nextNode = second.next;
            second.next = reverse;
            reverse = second;
            second = nextNode;
        }

        // Link all nodes together
        ListNode first = head;
        second = reverse;
        while (second != null) {
            ListNode firstNextNode = first.next;
            ListNode secondNextNode = second.next;
            first.next = second;
            second.next = firstNextNode;
            first = firstNextNode;
            second = secondNextNode;
        }
    }
}
