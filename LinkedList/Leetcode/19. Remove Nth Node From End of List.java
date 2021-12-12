class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i=0;
        ListNode fast = head;
        ListNode slow = head;
        while(i != n){
            fast = fast.next;
            i++;
        }
        if (fast == null) return head.next;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        System.out.println(fast.val);
        return head;
    }
}