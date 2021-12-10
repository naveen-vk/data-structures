class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode ptr = head;
        int length = 0;
        while(ptr != null){
            ptr = ptr.next;
            length++;
        }
        ListNode fast = head;
        ListNode slow = head;
        if(length % 2 == 1){
            while(fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println(slow.val);
            return slow;
        }
        else{
            while(fast.next.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println(slow.val);
            return slow.next;
        }
        //return head;
    }
}