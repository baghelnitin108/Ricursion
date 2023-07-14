public class Mininarray {
    public static void main(String[] args) {
       
        int[] arr = { 45, 3, 98, 34, 0, 23 };
       
        int ans = min(arr, 0);

        System.out.println(ans);
    }

    public static int min(int[] arr, int idx) {
        if (idx == arr.length) {
            return 1;
        }
        int remmin = min(arr, idx+1);
        int min = Math.min(remmin,arr[idx]);

        return min;
    }
}
