public class palindrome {
    public static void main(String[] args) {

        String str = "radar";

        boolean ans = checkpalindrome(str, 0, str.length()-1);

        System.out.println(ans);

    }
    public static boolean checkpalindrome(String str, int start, int end){

        if(start>end){
            return true;
        }else if(str.charAt(start) != str.charAt(end)){
            return false;
        }else{
            boolean ans = checkpalindrome(str, start+1, end-1);
            return ans;
        }
    }
}
