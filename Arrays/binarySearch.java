package Arrays;

import java.util.Scanner;

public class binarySearch {
    public static int search(int[] ar, int key) {
        int lo = 0;
        int hi = ar.length-1;
        
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(ar[mid] == key){
                return mid;
            }else if(ar[mid] < key){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return -1;
     }
         public static void main(String[] args) {
    
              Scanner s = new Scanner(System.in);
              int n = s.nextInt();
              int[] ar = new int[n];
              for (int i = 0; i < ar.length; i++) {
                   ar[i] = s.nextInt();
              }
              int key = s.nextInt();
              s.close();
              System.out.println(search(ar, key));
         }
}
