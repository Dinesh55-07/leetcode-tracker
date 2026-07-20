// Last updated: 20/07/2026, 11:44:47
1class Solution {
2    public ListNode removeNthFromEnd(ListNode head, int n) {
3        // Handle single node list
4        if (head.next == null) return null;
5        
6        ListNode ptr = head;
7        ListNode temp = head;
8        
9        // Move ptr forward n times to create the gap
10        int i = 1;
11        while (i <= n) {
12            ptr = ptr.next; 
13            i++;
14        }
15        
16        // If ptr becomes null, we need to remove the head
17        if (ptr == null) return head.next;
18        
19        // Move both until ptr reaches the last node
20        while (ptr.next != null) {
21            ptr = ptr.next;
22            temp = temp.next;
23        } 
24        
25        // Skip the nth node from the end
26        if (temp.next != null) {
27            temp.next = temp.next.next;
28        }
29        
30        return head;
31    }
32}