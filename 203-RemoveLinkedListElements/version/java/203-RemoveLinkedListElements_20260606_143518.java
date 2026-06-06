// Last updated: 06/06/2026, 14:35:18
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeElements(ListNode head, int val) {
13        ListNode dummy = new ListNode();
14        dummy.next = head;
15        
16        ListNode node = dummy;
17
18        if (head == null) return null;
19
20        while (node != null && node.next != null ){
21            if (node.next.val == val){
22                node.next = node.next.next;
23            }
24            else{
25                node = node.next;
26            }
27        }
28        return dummy.next;
29    }
30}