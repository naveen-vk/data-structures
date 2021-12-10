class Solution {
    public void deleteNode(ListNode node) {
        ListNode ptr = node.next;
        node.val = node.next.val;
        node.next = ptr.next;
    }
}