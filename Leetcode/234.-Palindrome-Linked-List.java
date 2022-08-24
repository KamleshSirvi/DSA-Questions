// using two pointer approach


// using stack - extra space
public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        Stack<Integer> stack = new Stack<>();
        // store whole linked list into stack
        while(curr != null){
            // System.out.println(curr.val);
            stack.push(curr.val);
            curr = curr.next;
        }
        while(head != null){
            if(head.val != stack.pop()){
                return false;
            }
            head = head.next;
        }
        return true;
    }
