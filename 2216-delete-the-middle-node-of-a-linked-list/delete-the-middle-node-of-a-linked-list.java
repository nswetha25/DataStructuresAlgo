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
    //https://www.youtube.com/watch?v=IPaMfcxQtP0
    public ListNode deleteMiddle(ListNode head) {

        if(head==null||head.next==null) return null;

        

        int length=0;
        ListNode current=head;
        while (current!=null){

            length++;
            current=current.next;


        }
          System.out.println(length);
          //Resetting the curent to the head
          current=head;
          int removeindex= length/2;
           System.out.println(removeindex);
//Lets navigate to one node before the removal of the node
          for(int i=0;i<removeindex-1;i++){
            current = current.next;
            }

          //Lets skip that middle node
          current.next=current.next.next;



          
 
        return head;
        
    }
    }
