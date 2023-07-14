import java.util.*;
public class calculateofpower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int x=sc.nextInt();
        
        // int n=2;
        // int x=5;

        int ans = find(n,x);

        System.out.println(ans);
    }
    public static int find(int n, int x){

        if(x==1){
            return n;
        }else if(x==0 || n==1){
            return 1;
        }

        int rem = find(n,x-1);
        int ans = n*rem;

        return ans;
    }
}
