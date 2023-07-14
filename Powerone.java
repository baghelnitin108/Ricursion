public class Powerone {
    public static void main(String[] args) {
        
        int n=3;
        int x=5;

        int ans = find(n,x);
        System.out.println(ans);

    }

    public static int find (int n, int x){
        if(x==1){
            return n;
        }else if(x==0 || n==1){
            return 1;
        }
        int rem = find(n, x/2);

        if(x%2==0){
            int ans = rem*rem;
            return ans;

        }else{
            int ans = rem*rem*n;
            return ans;
        }
    }
}
