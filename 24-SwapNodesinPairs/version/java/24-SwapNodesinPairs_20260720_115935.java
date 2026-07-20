// Last updated: 20/07/2026, 11:59:35
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
12    public ListNode swapPairs(ListNode head) {
13        ListNode dummy = new ListNode(0, head);
14        ListNode prev = dummy, cur = head;
15
16        while (cur != null && cur.next != null) {
17            ListNode npn = cur.next.next;
18            ListNode second = cur.next;
19
20            second.next = cur;
21            cur.next = npn;
22            prev.next = second;
23
24            prev = cur;
25            cur = npn;
26        }
27
28        return dummy.next;        
29    }
30}