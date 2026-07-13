// Last updated: 13/07/2026, 09:48:07
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
12    public ListNode reverseKGroup(ListNode head, int k) {
13       ListNode s = head;
14       ListNode f = head;
15       ListNode newhead = null;
16       ListNode prevtail = null;
17       while(f!=null){
18        f = s;
19        for(int i=1;i<k && f!=null ;i++){
20            f=f.next;
21        }
22
23        if(f==null) break;
24
25        ListNode nextnode =  f.next;
26        f.next = null;
27        ListNode x = reverse(s);
28       
29        if(s == head){
30            newhead = x;
31        }
32        else{
33            prevtail.next = x;
34        }
35        prevtail = s;
36        s.next =nextnode;
37        s = nextnode;
38        
39       } 
40       return newhead;
41    }
42    public ListNode reverse(ListNode head){
43        if(head== null || head.next == null) return head;
44        ListNode temp = head;
45        ListNode prev = null;
46        while(temp!=null){
47            ListNode t1 = temp.next;
48            temp.next = prev;
49            prev= temp;
50            temp = t1;
51        }
52        return prev;
53    }
54}