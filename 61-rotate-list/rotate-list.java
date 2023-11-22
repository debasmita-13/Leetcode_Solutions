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
        if(head==null || head.next==null || k==0)
            return head;
        int n=0;
        ListNode temp = head;
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
        k %= n;
        if(k!=0 && k!=n)
        {
            ListNode cur=head,prev=head;
            while(k>0){
            cur=cur.next;
                k--;
            }
                
            
            while(cur.next!=null){
                prev=prev.next;
                cur=cur.next;
            }
            cur.next=head;
            head=prev.next;
            prev.next=null;
        }
        return head;
    }
}