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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode prev = head;
        int count = 0 ;
		
		//count total length of the linked list
        while(prev!=null){
            count++;
            prev=prev.next;
        }
		//Edge case : To remove head
        if(n == count){
            head = head.next;
            return head;
        }
        
		//Remove from any other position
        count = count - n -1;
        prev  = head;
        while(count > 0){
            prev = prev.next;
            count--;
        }
        
        prev.next = prev.next.next;
        return head;
            
        
    }
}