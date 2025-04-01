package SString;
import java.util.*;
/*ex codeleet 45670123
op leetcode 01234567*/
class shuffleString {
    public String restoreString(String s ,int[] indices){
        char []arr = new char[s.length()];
        for(int i =0;i<s.length();i++){
            arr[indices[i]] = s.charAt(i);
            }
        return new String (arr);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a string :");
        String s = sc.nextLine();
        System.out.println("enter the indices :");
        int n = s.length();
        int[] indices = new int[n];
        for (int i =0;i<n;i++){
            indices[i] = sc.nextInt();
        }
        shuffleString ss= new shuffleString();
        String result = ss.restoreString(s ,indices);
        System.out.println(result);
    }
}
