import java.io.*;
import java.util.*;

class minStack{

    Stack<Integer> stack1;
    int minElem;

    //COnstructor
    minStack(){ stack1 = new Stack<Integer>();}

    void push(int x){
        if(stack1.isEmpty()){
            stack1.push(x);
            minElem = x;
        }
        if(x<minElem){
            stack1.push(2*x - minElem);
            minElem = x;
        }
        else { stack1.push(x); }
    }

    void pop(){
        if(stack1.isEmpty()){
            System.out.println("Empty Stack");
        }
        int ele = stack1.pop();
        if(ele<minElem){
            minElem = 2*minElem - ele;
        }
        
    }

    void getMin(){
        if(stack1.isEmpty()){
            System.out.println("Empty Stack");
        }
        else{
            System.out.println(minElem);
        }
    }
}

public class minimum{
    public static void main(String[] args){
        minStack stack1 = new minStack();
        stack1.push(4);
        stack1.push(3);
        stack1.push(5);
        stack1.push(6);
        stack1.getMin();
    }
}
    
    

