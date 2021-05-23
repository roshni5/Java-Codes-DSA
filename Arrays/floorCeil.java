package Arrays;

import java.util.Scanner;

public class floorCeil {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        sc.close();
        ceilAndFloor(arr,d);
     }
     
     public static void ceilAndFloor(int[]arr, int d){
         int floor = -1;
         int ceil = -1;
         int lo = 0;
         int hi = arr.length-1;
         while(lo <= hi){
             int mid = (lo+hi)/2;
             if(arr[mid] == d){
                 System.out.println(d);
             }else if(arr[mid] < d){
                 floor = arr[mid];
                 lo = mid + 1;
             }else{
                 ceil = arr[mid];
                 hi = mid -1;
             }
         }
         System.out.println(ceil);
         System.out.println(floor);
     }
    
}
