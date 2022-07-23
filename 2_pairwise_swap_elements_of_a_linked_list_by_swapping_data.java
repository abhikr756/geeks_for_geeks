class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
    Node dummy =new Node(-1),prev=dummy,curr=head;
    prev.next=head;
    while(curr!=null && curr.next!=null)
    {
        prev.next=curr.next;
        curr.next=curr.next.next;
        prev.next.next=curr;
        curr=curr.next;
        prev=prev.next.next;
    }
    return dummy.next;
    }
}