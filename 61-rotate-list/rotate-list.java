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
    public static ListNode reverseList(ListNode head)
    {
        ListNode rest = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }
    public static ListNode reverse(ListNode head,int start,int end)
    {
        while(start<end)
        {
            reverseList(head);
        }
        return head;

    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
            return head;
        int n=0;
        ListNode temp = head;
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
        k %= n;
        
        ListNode prev = head;
        ListNode cur = head.next;
        while(k!=0 && cur!=null)
        {
            if(cur.next==null)
            {
                cur.next = head;
                prev.next = null;
                head = cur;
                k--;
            }
            prev = cur;
            cur = cur.next;
        }
        return head;
    }
}