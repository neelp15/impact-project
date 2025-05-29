public class sumofotherelements {
    public static void main(String[] args) {
        int[] arr = {5,6,9,10,20};
        
        int n = arr.length;
        // int a[]= new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all elements: " + sum);
        for(int i=0; i<n; i++){
            arr[i]=sum-arr[i];
            System.out.print(arr[i]+" ");
        }
    }
}