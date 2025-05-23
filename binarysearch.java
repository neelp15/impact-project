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
        int low = 1;
        int high = arr.length - 2;
        int ans = 0;
        
        while(low<=high){
            int mid = low +(high - low)/2;
            if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]){
                ans = mid;
                break;
        }else if (arr[mid] > arr[mid -1] && arr[mid] < arr[mid + 1]){
            low = mid + 1;
        }else{
            high = mid - 1;
        }


    }
}

}