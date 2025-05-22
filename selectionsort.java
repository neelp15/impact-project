public class selectionsort {
    public static void main(String[] args){
        int arr[] = {7,1,4,2,3};
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int small = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[small]){
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
