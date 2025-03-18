package SString;
import java.util.*;
// remove duplicate values from a string.
public class MinString {
    public int miniString(String s){
        Set <Character> unique = new HashSet<>();
        for (int i =0;i<s.length();i++){
            unique.add(s.charAt(i));
        }
        return unique.size();
    }
}
