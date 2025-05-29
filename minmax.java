import java.util.Random;

public class minmax {
    public static void main(String[] args) {
        Random rd = new Random();
        int arr[] = new int[200];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(200);
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
