import java.io.*;
import java.util.*;

class maxStack{
    Stack<Integer> stack1;
    int maxElem;

    //COnstructor
    maxStack(){ stack1 = new Stack<Integer>();}

    void push(int x){
        if(stack1.isEmpty()){
            stack1.push(x);
            maxElem = x;
        }
        if(x>maxElem){
            stack1.push(2*x - maxElem);
            maxElem = x;
        }
        else { stack1.push(x); }
    }

    void pop(){
        if(stack1.isEmpty()){
            System.out.println("Empty Stack");
        }
        int ele = stack1.pop();
        if(ele>maxElem){
            maxElem = 2*maxElem - ele;
        }
        
    }

    void getMax(){
        if(stack1.isEmpty()){
            System.out.println("Empty Stack");
        }
        else{
            System.out.println(maxElem);
        }
    }
}

public class maximum{
    public static void main(String[] args){
        maxStack stack = new maxStack();
        stack.push(4);
        stack.push(100);
        stack.push(5);
        stack.push(6);
        stack.getMax();
    }
}