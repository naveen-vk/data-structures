import java.util.Arrays;

public class Question2 {

    static boolean ifPermutation(String str1,String str2)
    {
        // String str1 = "hello";
        // String str2 = "qwert";
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                return false;
            }
        }
        if(arr1.length != arr2.length)
        {
            return false;
        }
        return true;
    } 
    public static void main(String[] args)
    {
        String str1 = "hello";
        String str2 = "hello";
        if(ifPermutation(str1,str2))
        {
            System.out.println("One is the permutation of other!!!!");
        }        
        else{
            System.out.println("Both are not permutations of each other");
        }
    }
    
}
