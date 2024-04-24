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
    public ListNode reverseList(ListNode head) {

        //There can be many ways how this problem can be solved

        //Lets use stack data structure first

       //https://chat.openai.com/c/f3dd89e1-b4c3-4c81-9198-80743e8f4b47

       //https://www.youtube.com/watch?v=3IN0BP9Ni6E

    //     Stack<Integer> stack=new Stack<>();
        
    //    while(head!=null){
    //     stack.push(head.val);
    //     head=head.next;
    //    }

    //    ListNode rev=new ListNode(0);
    //    ListNode ptr=rev;

    //    while(!stack.isEmpty()){
    //     ptr.next=new ListNode(stack.pop());
    //     ptr=ptr.next;
    //    }

    //    return rev.next;

       //FOr this TC: O(n) and SC: O(n)

       //Method 2

       //Without using extra space

       //For this instead of creating a new linkedlist we are taking the last node link and pointing to its previous and so on

       //Finally when we reach the first node lets point it to null and then place the head position to the end

       //we have reversed without using any extra space and any extra datastructure

       //Edge case

       if(head==null) return null;

       if(head.next==null) return head;

       //Lets have two pointers which has preNode which points to null because the final node should be ponting to null

       ListNode prevNode=null;
       ListNode curNode=head;

       while(curNode!=null){
        ListNode nextNode=curNode.next;
        curNode.next=prevNode; //Here removing the pointer of current node to previous node 
        prevNode=curNode;
        curNode=nextNode;

       }        

       head=prevNode;

       return head;
    }
}