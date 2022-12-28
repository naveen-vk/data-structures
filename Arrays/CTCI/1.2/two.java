//package CTCI.1.2;
import java.util.*;

public class two {
    public static boolean permutation(String word1, String word2) {
		
        char[] s1 = word1.toCharArray();
        char[] s2 = word2.toCharArray();
		Arrays.sort(s1);
        Arrays.sort(s2);
        new String(s1);
        new String(s2);
        System.out.println(s1);
        System.out.println(s2);
    
        return s1.equals(s2);
	}
    public static void main(String[] args) {
		String word1 = "dcba";
        String word2 = "abcd";
		if(permutation(word1,word2))
        {
			System.out.println("True");
		}
        else{
            System.out.println("False");
        }
	}
}
