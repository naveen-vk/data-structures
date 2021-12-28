import java.util.*;

class Queue{
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    
    void enqueue(int x){
        stack1.push(x);
        
    }

    void dequeue(){
        while(!stack1.isEmpty()){
            Integer i = stack1.pop();
            stack2.push(i);
        }
        
        Integer j = stack2.pop();
        System.out.println(j);
    }
}

public class question4 {
    public static void main(String[] Args){
        Queue q = new Queue();
        q.stack1 = new Stack<>();
        q.stack2 = new Stack<>();
        q.enqueue(1);
        q.enqueue(3);
        
        q.enqueue(5);
        q.enqueue(6);
        q.dequeue();
    }    
}
