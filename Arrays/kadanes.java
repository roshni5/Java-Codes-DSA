package Arrays;

import java.util.Scanner;

public class kadanes {
    public static int maxSum(int[] arr) {
        int cs = arr[0];
        int ms = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(cs < 0){
                cs = arr[i];
            }else{
                cs += arr[i];
            }
             if(cs > ms){
                    ms = cs;
            }
        }
        return ms;
  }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
        }
      sc.close();
        System.out.println(maxSum(arr));
        
   }
}
