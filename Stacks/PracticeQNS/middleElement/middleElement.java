import java.io.*;
import java.util.*;

class middle{
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    void push(){
        for(int i = 0;i<15;i++){
            stack1.push(i);
        }
        System.out.println(stack1.size());
    }
    void removeMiddle(){
        int middleElement = stack1.size() / 2; 
        int i=0;
        while(!stack1.isEmpty()){
            if(i!=middleElement){
            int x = stack1.pop();
            stack2.push(x);
            i++;
            }
            else if(i==middleElement){
                stack1.pop();
                i++;
            }
        }
        while(!stack2.isEmpty()){
            int y = stack2.pop();
            stack1.push(y);
        }

    }
    void display(){
        while(!stack1.isEmpty()){
            int x = stack1.pop();
            System.out.println(x);
        }
    }  
}

public class middleElement {
    public static void main(String[] Args){
        middle s = new middle();
        s.stack1 = new Stack<>();
        s.stack2 = new Stack<>();
        
        s.push();
        
        s.removeMiddle();

        s.display();
    }
}
