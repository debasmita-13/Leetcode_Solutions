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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head;
        int n = 0;
        while(temp!=null)
        {
            n++;
            temp= temp.next;
        }
        
        ListNode arr[] = new ListNode[k];
        int len = n/k, extra = n%k;
        
        ListNode prev = null;
        ListNode cur = head;
        for(int i=0; i<k && (cur!=null); i++, extra--)
        {
            arr[i] = cur;
            for(int j=0; j<len+(extra>0?1:0) && (cur!=null); j++)
            {
                prev = cur;
                cur = cur.next;
            }
            prev.next = null;
        }
        return arr;
    }
}