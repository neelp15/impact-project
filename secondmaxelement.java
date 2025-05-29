public class secondmaxelement {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,5,6,8,8,8,7};
        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstmax) {
                secondmax = firstmax;
                firstmax = arr[i];
            } else if (arr[i] > secondmax && arr[i] != firstmax) {
                secondmax = arr[i];
            }
        }
        System.out.println("First max: " + firstmax);
        System.out.println("Second max: " + secondmax);
    }    
}
