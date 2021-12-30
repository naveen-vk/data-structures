import java.io.*;
import java.util.*;

class minStack{

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int minEle = 0;
   
    void push(int x){
        if(stack1.isEmpty()){
            stack1.push(x);
            stack2.push(x);
            minEle = x;
        }
        else{
            if(x<minEle){
                minEle = x;
                stack1.push(x);
                stack2.push(minEle);
            }
            else{
                stack1.push(x);
                stack2.push(minEle);
            }
        }
    }

    void pop(){
        stack1.pop();
        stack2.pop();
    }

    void getMin(){
        if(stack1.isEmpty()){
            System.out.println("Empty Stack");
        }
        else{
            System.out.println(stack1.peek());
        }
    }
}

public class minElement1{
    public static void main(String[] args){
        minStack s = new minStack();
        s.stack1 = new Stack<>();
        s.stack2 = new Stack<>();
        
        s.push(100);
        s.push(4);
        s.push(3);
        s.pop();
        s.push(5);
        s.push(6);
        s.getMin();
    }
}
    
    

