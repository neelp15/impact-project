public class missingelement2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,9,10,11,14,15};
        for(int i=0;i<arr.length-1;i++){
            int n = arr[i+1] - arr[i];
            if(n != 1){
                for(int j=arr[i]+1;j<arr[i+1];j++){
                    System.err.print(j+" ");
                }
            }
        }
    }
}
