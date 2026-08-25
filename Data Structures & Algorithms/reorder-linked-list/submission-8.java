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
        ListNode fast = head.next;
        ListNode slow = head;

        // find middle of head
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //Reverse after middle of head
        ListNode second = slow.next;
        ListNode prev = slow.next = null;
        while (second != null) {
            ListNode nextNode = second.next;
            second.next = prev;
            prev = second;
            second = nextNode;
        }

        // Restructure head
        ListNode first = head;
        second = prev;
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
