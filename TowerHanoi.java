public class TowerHanoi {
   

    public static void main(String[] args) {
        tow(3,'S','D','H');
        
    }

    public static void tow(int n, char s,char d,char h) {

        if (n==1){
            System.out.println(n+"["+s+"->"+d+"]");
            return;
        }

        tow(n-1,s,h,d);
        System.out.println(n+"["+s+"->"+d+"]");
        tow(n-1,h,d,s);

        
    }
    
}
