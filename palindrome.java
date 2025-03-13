package String;

import java.util.*;

public class palindrome {
    public static boolean isPalindrome(String str){
        int start =0 ;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            
                start++;
                end--;
            }
            return true;
        }
    
        public static void main (String []args){
            Scanner sc = new Scanner(System.in);
            System.out.print("enter a string :");
            String str = sc.nextLine();

            if(isPalindrome(str)){
                System.out.print("is a palindrome :");
            }
            else{
                System.out.println("is not a palindrome");
            }
    }
}
