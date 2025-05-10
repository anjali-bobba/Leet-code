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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=null;
        ListNode last=null;
        ListNode num1=l1;
        ListNode num2=l2;
        int carry=0;
        int data=0;
        int sum=0;
        while(num1!=null && num2!=null){
            sum= num1.val+num2.val+carry;
            data=sum%10;
            carry=sum/10;
            ListNode newnode=new ListNode(data);
            if(head==null){
                head=newnode;
            }else{
                last.next=newnode;
            }
            last=newnode;
            num1=num1.next;
            num2=num2.next;
        }
        while(num1!=null){
            sum=num1.val+carry;
            data=sum%10;
            carry=sum/10;
            ListNode newnode=new ListNode(data);
            last.next=newnode;
            last=newnode;
            num1=num1.next;
        }
        while(num2!=null){
            sum=num2.val+carry;
            data=sum%10;
            carry=sum/10;
            ListNode newnode=new ListNode(data);
            last.next=newnode;
            last=newnode;
            num2=num2.next;
        }
        if(carry!=0){
            ListNode newnode=new ListNode(carry);
            last.next=newnode;
            last=newnode;
        }

        return head;
    }
}