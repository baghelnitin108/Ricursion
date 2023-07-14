
import java.util.*;
public class subSequence {
    public static void main(String[] args) {
        String str="abc";
        allSubSequences(str, 0, "");
        
    }

   public static void allSubSequences(String str,int idx ,String newString){
    if(idx==str.length()){
        System.out.print(newString+",");
        return;
    }

    char currChar=str.charAt(idx);
    //to be
    allSubSequences(str, idx+1, newString+currChar);
    //not to be
    allSubSequences(str, idx+1, newString);
   }
    
}
