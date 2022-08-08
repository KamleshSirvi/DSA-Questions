int getNthFromLast(Node head, int n)
    {
    	// Your code here
    //  Naive solution High time complexity
    // 	int count = 1;
    //     Node curr = head;
    //     while(curr.next != null){
    //         curr = curr.next;
    //         count++;
    //     }
    //     if(count - n < 0){
    //         return -1;
    //     }else{
    // 	Node start = head;
    // 	Node second = head;
    // 	for(int i = 1; i < n; i++){
    // 	    second = second.next;
    // 	}
    // 	int res = count;
    // 	while(second.next != null){
    // 	    second = second.next;
    // 	    start = start.next;
    // 	}
    // 	return start.data;
    // }
    
    // reverse linked List approach
    Node prev = null;
    Node curr = head;
    Node next = null;
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    head = prev;
    // return head;
    Node current = head;
    for(int i = 1; i < n; i++){
        current = current.next;
    
        if(current == null) return -1;
    }
    return current.data;
    }
