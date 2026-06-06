// Last updated: 06/06/2026, 13:42:26
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
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode node = head;
14
15        while (node != null && node.next != null){
16            if (node.next.val == node.val){
17                node.next = node.next.next;
18            }else{
19                node = node.next;
20            }
21        }
22        return head;
23    }
24}