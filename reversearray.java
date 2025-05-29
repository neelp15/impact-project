import java.util.Arrays;
import java.util.Scanner;
public class reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    int start=0;
    int end=n-1;
    while(start<end){
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    start++;
    end--;
    System.out.println(Arrays.toString(arr));
    }
    int target = sc.nextInt();
    int flag=0;
    for(int i=0;i<n-1;i++){
        if(arr[i]==target){
            flag= 1;
        }
    }
    if(flag==1){
        System.out.println("Element found at index ");
    }else{
        System.out.println("Element not found");
    }
}
}


    
