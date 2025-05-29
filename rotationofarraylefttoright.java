import java.util.Random;

public class rotationofarraylefttoright {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 7, 8, 9, 11, 17 };
        Random rd = new Random();
        int n = arr.length;
        int k = 88888887;
        k = k % n;
        for (int i = 0; i < k; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
