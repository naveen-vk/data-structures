import java.io.*;
import java.util.*;
public class imple1 {
    
    //Push method
    static void stackPush(Stack<Integer> stack1){
        for(int i=1;i<13;i++){
            stack1.push(i);
        }
    }

    //Peek method
    static void stackPeek(Stack<Integer> stack1){
        Integer topElement = (Integer) stack1.peek();
        System.out.println("Top element = "+ topElement);
    }

    //pop Method
    static void stackPop(Stack<Integer> stack1){
        for(int i=1;i<10;i++){
            stack1.pop();
        }
    }

    //Search method
    static void stackSearch(Stack<Integer> stack1,int element){
        Integer pos = (Integer) stack1.search(element);
        if(pos == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at " + pos);
        }
    }
    public static void main(String[] args){
        //Create an Integer stack
        Stack<Integer> stack1 = new Stack<Integer>();

        //push function
        stackPush(stack1);
        stackPeek(stack1);
        stackPop(stack1);
        stackPeek(stack1);
        stackSearch(stack1,2);
        System.out.println(stack1.size());
        while(!stack1.isEmpty()){
            System.out.println(stack1.pop());
        }
    }
}
