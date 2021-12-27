class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode ptr = head;
        int length = 0;
        while(ptr != null){
            length++;
            ptr = ptr.next;            
        }
        if(length == 1) return null;
        
            int k=1;
            int middle = length/2;
            ptr = head;
            while(k!= middle){
                ptr = ptr.next;
                k++;    
            }
            ptr.next = ptr.next.next;
        return head;
    }
}