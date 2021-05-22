package Arrays;

import java.util.Scanner;

public class Diff {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[]arr1 = new int[n1];
        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[]arr2 = new int[n2];
        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }
        sc.close();
       int[] ans = sub(arr1, arr2);
       int zero = 0;
       while(ans[zero] == 0){
           zero++;
       }
       int idx = zero;
       for(int i = idx; i < ans.length; i++){
           System.out.println(ans[i]);
       }
     }
     public static int[] sub(int[]a1, int[]a2){
         int len = a2.length;
         int borrow = 0;
         int i = a1.length-1;
         int j = a2.length-1;
         int[]res = new int[len];
         int k = res.length-1;
         while(j >= 0){
             int sub = (a2[j]+borrow);
             if(i >= 0){
                 sub -= a1[i];
             }
             int d = sub;
             if(sub < 0){
                d += 10;
                borrow = -1;
             }else{
                 borrow = 0;
             }
             res[k] = d;
             i--;
             j--;
             k--;
             
         }
         return res;
     }
    
}
