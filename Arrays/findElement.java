package Arrays;

import java.util.Scanner;

public class findElement {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i = 0; i <n; i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        sc.close();
        boolean isFound = false;
        int idx = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == d){
                isFound = true;
                 idx = i;
                break;
            }
        }
        if(isFound == true){
            System.out.print(idx);
        }else{
            System.out.print("-1");
        }
     }
    
}
