package Arrays;

import java.util.Scanner;

public class subsets {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        subSets(arr, n);
     }
     public static int[] binary(int d, int n){
         int[]ans = new int[n];
         int idx = ans.length-1;
         while(d > 0){
             int rem = d % 2;
             d = d/2;
             ans[idx] = rem;
             idx--;
         }
         return ans;
     }
     public static void subSets(int[]arr, int n){
         int ts = (int)Math.pow(2, n);
         for(int d = 0; d < ts; d++){
             int[]bin = binary(d, n);
             
             for(int i = 0; i < bin.length; i++){
                 if(bin[i] == 0){
                     System.out.print("-\t");
                 }else{
                     System.out.print(arr[i]+"\t");
                 }
             }
             System.out.println();
         }
         
     }
}
