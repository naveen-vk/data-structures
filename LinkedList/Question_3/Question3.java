
 
// A Linked List Node
class Node
{
    int data;
    Node next;
 
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}
 
class Question3
{
    // Helper function to print a given linked list
    public static void printList(Node head)
    {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
 
    // Function to remove duplicates from a sorted list
    public static Node removeMidelement(Node head)
    {
        Node ptr1 = head;
        Node ptr2 = head;
        int length =0;
        //to get length of the list
        while(ptr1 !=null){
            ptr1 = ptr1.next;
            length++;
        }
        
        if(length %2 ==0){
            for(int i=1;i<length/2-1;i++){
                ptr2 = ptr2.next;
            }
            ptr2.next = ptr2.next.next;
            return head;
        }
        for(int i=1;i<length/2;i++){
           ptr2 = ptr2.next;
        }
        ptr2.next = ptr2.next.next;
        return head;
    }
 
    public static void main(String[] args)
    {
        // input keys
        int[] keys = {1,2,3,4,5,6,7,8,9};
 
        // points to the head node of the linked list
        Node head = null;
 
        // construct a linked list
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
 
        removeMidelement(head);
        // print linked list
        printList(head);
    }
}
