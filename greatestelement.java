public class greatestelement {
    public static void main(String[] args) {
        int arr[] = {5,5,2,16,16,2,14,16,2,9};
        int n = arr.length;
        for (int i = 0; i < n-2; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i+3; j++){
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            arr[i] = max;
            }
            if (arr[n-2] > arr[n-1]) {
                arr[n-1] = arr[n-2];
            }else {
                arr[n-2] = arr[n-1];
            }
            for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}