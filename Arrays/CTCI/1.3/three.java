// package CTCI.1.3;
// 1.3 URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
// has sufficient space at the end to hold the additional characters, and that you are given the "true"
// length of the string. (Note: If implementing in Java, please use a character array so that you can
// perform this operation in place.)
// EXAMPLE
// Input: "Mr 3ohn Smit h 13
// Output: "Mr%203ohn%20Smith"
// Hints: #53,0118 

public class three {
    public static String URLify(String input){
        char[] s = input.toCharArray();
        for(int i=0;i<s.length;i++){
            if(s[i] == " ")
        }
        return input;
    }

    public static void main(String Args[]){
        String input = "Mr John Smith   ";
        System.out.println(URLify(input));
    }
}
