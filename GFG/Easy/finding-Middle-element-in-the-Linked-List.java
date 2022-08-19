// Two pointer approach
int getMiddle(Node head)
    {
         // Your code here.
         Node first = head;
         Node second = head;
         // evert time when while loop run
         // first pointer going to next pointer 
         // second pointer going to next to next pointer
         // when second pointer reach at the end of the linked list then first pointer will reach at middle of the linked list
         
         while(second != null && second.next != null){
             first = first.next;
             second = second.next.next;
         }
         return first.data;
    }
