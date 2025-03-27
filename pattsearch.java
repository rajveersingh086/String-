package SString;
import java.util.*;
class pattsearch
{
    //Function to check if the given pattern exists in the given string or not.
    static boolean search(String pat, String txt)
    {
        int m = pat.length();
        int n = txt.length();
        for (int i = 0;i<=n-m;i++){
            int j;
            for (j = 0;j<m;j++){
                if(pat.charAt(j)!=txt.charAt(i+j)){
                    break;
                }
            }
            if(j==m)
            return true;
        }
        return false;
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a text :");
        String text = sc.nextLine();
        
        System.out.println("Enter a pattern :");
        String pattern = sc.nextLine();
        
        boolean found = search (pattern ,text);
        
        if(found){
            System.out.println("text will be match :");
        }
        else{
            System.out.println("pattern will not match :");
        }
    }
}