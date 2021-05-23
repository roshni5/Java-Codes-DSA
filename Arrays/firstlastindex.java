package Arrays;

import java.util.Scanner;

public class firstlastindex {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        sc.close();
        int fi = firstIndex(arr, d);
        int li = lastIndex(arr, d);
        System.out.println(fi);
        System.out.println(li);
    
     }
     public static int firstIndex(int[]arr, int d){
         int lo = 0;
         int hi = arr.length-1;
         int fi = -1;
         while(lo <= hi){
             int mid = (lo+hi)/2;
             if(arr[mid] == d){
                 fi = mid;
                 hi = mid-1;
             }else if(arr[mid] < d){
                 lo = mid+1;
             }else{
                 hi = mid-1;
             }
         }
         return fi;
     }
     public static int lastIndex(int[]arr, int d){
          int lo = 0;
         int hi = arr.length-1;
         int li = -1;
         while(lo <= hi){
             int mid = (lo+hi)/2;
             if(arr[mid] == d){
                 li = mid;
                 lo  = mid+1;
             }else if(arr[mid] < d){
                 lo = mid+1;
             }else{
                 hi = mid-1;
             }
         }
         return li;
     }
    
}
