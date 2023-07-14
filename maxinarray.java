public class maxinarray {
    public static void main(String[] args) {

        int[] arr = { 45, 3, 98, 34, 0, 23 };
       
        int ans = max(arr, 0);

        System.out.println(ans);
    }

    public static int max(int[] arr, int idx) {
        if (idx == arr.length) {
            return -1;
        }
        int remmax = max(arr, idx+1);
        int max = Math.max(remmax,arr[idx]);

        return max;
    }
}
