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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        k = k % size;
        while(k > 0){
            ListNode oldHead = head;
            temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            ListNode newHead = temp.next;
            temp.next = null;
            newHead.next = oldHead;
            head = newHead;
            k--;
        }
        return head;
    }
}