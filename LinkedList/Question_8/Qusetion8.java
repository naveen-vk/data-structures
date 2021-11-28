static boolean hasCycle(SinglyLinkedListNode head) {

    if(head==null)
        return false;
    
    if(head.next==head)
        return true;
    
    SinglyLinkedListNode slow=head;
    SinglyLinkedListNode fast=head;
    
    while(fast!=null)
        {
        
         fast=fast.next;
         if(fast!=null)
             fast=fast.next;
         else
             return false;
        
         slow=slow.next;
        
        if(slow==fast)
            return true;
        
    }
    return false;


    }
