public class frequentreapeatingelement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 1, 2, 2, 1 , 2, 2, 4};
        int n = arr.length;
        int maxCount = 0;
        int value = 0;

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                value = arr[i];
            }
        }
        if(maxCount > n/2){
            System.out.println("The element is " + value + " and it is repeated " + maxCount + " times");
        };
        // System.out.println("The element is " + value + " and it is repeated " + maxCount + " times");

    }
    
}
