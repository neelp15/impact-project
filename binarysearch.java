import java.util.*;
public class binarysearch{
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // int low = 0;
        // int high = arr.length - 1;
        // int target = 5;
        // int result = -1;

        // while(low <= high){
        //     int mid = low + (high - low)/2;
        //     if(arr[mid] == target){
        //         result = mid;
        //         break;
        //     }else if(arr[mid] < target){
        //         low = mid + 1;
        //     }else if(arr[mid] > target){
        //         high = mid - 1;
        //     }else{
        //         System.out.println("Element not found");
        //         break;
        //     }
        // }
        // System.out.println(result);
        int[] arr = {10,20,30,40,30,20,10};
        int low = 0;
        int high = arr.length - 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for ( int i=0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum value: " + max);

    }

}