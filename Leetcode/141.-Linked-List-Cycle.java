// using two pointer approach
public boolean hasCycle(ListNode head) {
        // Two pointer approach
        ListNode slow = head;
        ListNode fast = head;
        int flag = 0;
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            return true;
        }else{
            return false;
        }
}

// using HashMap
public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode curr = head;
        while(curr != null){
            if(set.contains(curr)){
                return true;
            }
            set.add(curr);
            curr = curr.next;
        }
        return false;
    }
