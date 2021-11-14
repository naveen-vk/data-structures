
 
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
 
class Question2
{
    // Helper function to print a given linked list
    public static void printList(Node head)
    {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
 
    // Function to return k'th element from last
    public static int returnKthelement(Node head,int k)
    {
        Node ptr = head;
        Node current = head;
        int i=0;
 
        // traverse ptr for k times
        while (i <= k){
            ptr = ptr.next;
            i++;
        }
        // traverse ptr and current till ptr is null
        while(ptr != null){
            current = current.next;
            ptr = ptr.next;
        }
        return current.data;
    }
 
    public static void main(String[] args)
    {
        // input keys
        int[] keys = {0, 3, 4, 2, 5, 4, 1, 3};
        int k=7;
        // points to the head node of the linked list
        Node head = null;
 
        // construct a linked list
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
 
        System.out.println(returnKthelement(head,k));
 
    }
}