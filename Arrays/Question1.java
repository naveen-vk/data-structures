import java.util.*;

public class Question1{

    static void isUnique(String str)
    {
        int len=str.length();
        int count=0;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    count++;
                }
                
            }
        }
        if(count>0)
        {
            System.out.println("Not Unique");
        }
        else
        {
            System.out.println("Unique");
        }
    }
    public static void main(String[] args){
        isUnique("Hello World"); 
        isUnique("mobile");
        isUnique("watch");
        isUnique("hello");
        isUnique("123456");
        isUnique("@!1234");
        isUnique("!@#$%^&*()_+");
        isUnique("Naveen");
    }
}