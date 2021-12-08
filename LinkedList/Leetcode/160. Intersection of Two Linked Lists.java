public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int oneSize = 0;
        int twoSize = 0;
        ListNode one = headA;
        ListNode two = headB;
        while(one != null){
            oneSize++;
            one = one.next;
        }
        while(two != null){
            twoSize++;
            two = two.next;
        }
        one = headA;
        two = headB;
        if(oneSize > twoSize){
            int difference = oneSize - twoSize;
            while(difference!=0){
                one = one.next;
                difference--;
            }
        }
        if(twoSize>oneSize){
            int difference = twoSize - oneSize;
            while(difference!=0){
                two = two.next;
                difference--;
            }
        }
        while(one != null){
            if(one == two){
                return one;
            }
            else{ one = one.next; two = two.next; }
        }
    return null;
    }
}