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
    public int pairSum(ListNode head) {
//if this is doubly linked list it would have been easy because we can iterate backward also so its straightforward
//but this is singly linkedlist

//Lets use an array which occupies O(n) space
        // if(head==null) return 0;

        // if(head.next==null) return head.val;
         
        // ArrayList<Integer> array=new ArrayList<>();
        // ListNode current=head;
        // while(current!=null){
        //     array.add(current.val);
        //     current=current.next;

        // }

        // System.out.println(array);
        // int count=0;
        //  int n=array.size();
        // for(int i=0;i<n;i++){
          
        //   if(array.get(i)+array.get(n-i-1)>count) { count=array.get(i)+array.get(n-i-1);}
        // }

        // return count;

        //Above code works but its not efficient of having arraylist again
        //Lets see another way

        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;

        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
       
       //Next reversing the second half
       ListNode current=slow;
       ListNode prevnode=null;

       while(current!=null){
        ListNode next= current.next;
        current.next=prevnode;
        prevnode=current;
        current=next;

       }

       //calculating the max twinsum
       int count=0;

       ListNode firsthalf=head;
       ListNode secondhalf=prevnode;

       while(secondhalf!=null){

        count=Math.max(count,firsthalf.val+secondhalf.val);
        firsthalf=firsthalf.next;
        secondhalf=secondhalf.next;
       }




        return count;
    }
}