package Arrays;

import java.util.Scanner;

public class barChart {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        barChart1(arr);
     }
     public static void barChart1(int[]arr){
          int maxHeight = arr[0];
          
          for(int i = 0; i < arr.length; i++){
              if(arr[i] > maxHeight){
                  maxHeight = arr[i];
              }
          }
          for(int h = maxHeight; h >= 1; h--){
              for(int i = 0; i < arr.length; i++){
                  if(arr[i] >= h){
                      System.out.print("*	");
                  }else{
                      System.out.print("	");
                  }
              }
              System.out.println();
          }
     }
}
