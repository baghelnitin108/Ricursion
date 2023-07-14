//public class basic {

    // public static void main(String[] args) {
    //     System.out.println("Main Started");
    //     firstfunction();
    //     System.out.println("Main End" );
    // }

    // public static void firstfunction() {
    //     System.out.println("First function called start");
    //     secondfunction();
    //     System.out.println("First function called end");

        
    // }


    // public static void secondfunction() {

    //     System.out.println("Second function called");
        
    // }
    //}





// public class basic {

    
//     public static void main(String[] args) {
//         int n=5;
//         print(n);
//     }

//     public static void print(int n) {                     //print decreasing
//         if(n<0){
//             return;
//         }

//         System.out.println(n);
//         print(n-1);
        
//     }
// }







// public class basic {

    
//     public static void main(String[] args) {
//         int n=5;
//         print(n);
//     }

//     public static void print(int n) {                       //print increasing
//         if(n<=0){
//             return;
//         }

//         print(n-1);
//         System.out.println(n);
        
        
//     }
// }









public class basic {

    
    public static void main(String[] args) {
        int n=5;
        int ans=fact(n);
        System.out.println(ans);
    
    }

    public static int fact(int n) {                           //factorial in recursion
        if(n==0 || n==1){
            return 1;
        }

        int pre=fact(n-1);
        int ans=n*pre;

        return ans;
      
        
        
    }
}