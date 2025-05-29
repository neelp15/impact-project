public class missingelement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 9};
        for (int i = 0; i < arr.length - 1; i++) {
            int n = arr[i] +arr[i+1];
            if (n%2 == 0) {
                System.out.println("Missing element: " + (n/2));
            }
        }
    }
}
