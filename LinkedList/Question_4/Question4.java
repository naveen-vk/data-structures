Node partition(Node head,int k)
    {
        Node firstHalf = null;
        Node secondHalf = null;
        Node ptr1 = firstHalf;
        Node ptr2 = secondHalf;
        Node ptr = head;
        while(ptr != null){
            if(ptr.data < k){
                ptr1.data = ptr.data;
                ptr1 = ptr1.next;
            }
            else {
                ptr2.data = ptr.data;
                ptr2 = ptr2.next;
            }
            ptr = ptr.next;
        }
        ptr1 = secondHalf;
        return firstHalf;
    }