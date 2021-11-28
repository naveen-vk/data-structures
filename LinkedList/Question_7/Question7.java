static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    SinglyLinkedListNode temp1 = head1;
    SinglyLinkedListNode temp2 = head2;
    int i=0;
    int j=0;
    while(temp1 != null){
        temp1 = temp1.next;
        i++;
    }
    
    System.out.print(i);
    while(temp2 != null){
        temp2 = temp2.next;
        j++;
    }
    System.out.print(j);
    int diff = i-j;
    if(diff<0){
        diff = diff * -1;
        SinglyLinkedListNode node = head1;
        head1 = head2;
        head2 = node;
    }
    int k = 0;
    while(k<diff){
        head1 = head1.next;
        k++;
    }
    while(head1 != null && head2 != null){
        if(head1 == head2){ return head1.data;}
        head1 = head1.next;
        head2 = head2.next;
    }
    return 0;
}
