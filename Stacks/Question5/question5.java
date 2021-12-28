import java.util.*;

class Queue{
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    
    void push(int x){
        stack1.push(x);
    }
    void sort(){
        while(!stack1.isEmpty()){
        if(stack2.isEmpty()){
            Integer x = stack1.pop();
            stack2.push(x);
        }
        else if(stack1.peek() >= stack2.peek()){
            Integer x = stack1.pop();
            stack2.push(x);
        }
        else if(stack1.peek() < stack2.peek()){
            Integer x = stack1.pop();
            while(!stack2.isEmpty() && x < stack2.peek()){
                Integer y = stack2.pop();
                stack1.push(y);
            }
            stack2.push(x);    
        }
        }
    }
    void display(){
        while(!stack2.isEmpty()){
            Integer x = stack2.pop();
            System.out.println(x);
        }
    }
}

public class question5 {
    public static void main(String[] Args){
        Queue q = new Queue();
        q.stack1 = new Stack<>();
        q.stack2 = new Stack<>();
        q.push(34);
        q.push(3);
        q.push(31);
        q.push(98);
        q.push(92);
        q.push(23);

        q.sort();
        q.display();
    }    
}
