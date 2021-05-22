package Arrays;

import java.util.Scanner;

public class sumOf2Arr {
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
    int[] res = sum(arr1, arr2);
    for(int i = 0; i < res.length; i++){
        if(i == 0 && res[0] == 1)
        System.out.println(res[i]);
        else if(i > 0)
        System.out.println(res[i]);
    }
 }
 public static int[] sum(int[]A, int[]B){
     
     int len = Math.max(A.length, B.length);
     int carry = 0;
     int[]ans = new int[len+1];
     int a = A.length-1;
     int b = B.length-1;
     int k = ans.length-1;
     
     while(k > 0){
       int sum = carry;
       
       if(a >= 0){
           sum += A[a];
       }
       if(b >= 0){
           sum += B[b];
       }
       ans[k] = sum % 10;
       carry = sum / 10;
       a--;
       b--;
       k--;
     }
     return ans;
 }

}
