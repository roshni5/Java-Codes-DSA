package Arrays;

import java.util.Scanner;

public class spring {
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][]mat = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int s = sc.nextInt();
        int r = sc.nextInt();
        spiralArray(mat,s, r);
        display(mat);
    }
    public static int[] fill1DArray(int[][]mat, int s){
        int row = mat.length;
        int col = mat[0].length;
        
        int rs = s - 1;
        int cs = s - 1;
        int re = row - s;
        int ce = col - s;
        
        int tes = 2*(re-rs) + 2*(ce-cs);
        int[] arr = new int[tes];
        int idx = 0;
        //left wall
        for(int i = rs; i <= re; i++){
            arr[idx] = mat[i][cs];
            idx++;
        }
        cs++;
        //bottom wall
        for(int i = cs; i <= ce; i++){
            arr[idx] = mat[re][i];
            idx++;
        }
        re--;
        //right wall
        for(int i = re; i >= rs; i--){
            arr[idx] = mat[i][ce];
            idx++;
        }
        ce--;
        //top wall
        for(int i = ce; i >= cs; i--){
            arr[idx] = mat[rs][i];
            idx++;
        }
        rs++;
        
        return arr;
    }
    public static void reverse(int[]arr, int lo, int hi){
        while(lo < hi){
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }
    }
    public static void rotate(int[] arr, int k){
        int n = arr.length;
         
         k = k % n;
         if(k < 0){
             k = k + n;
         }
         reverse(arr, 0, n-1);
         reverse(arr, 0, k-1);
         reverse(arr, k, n-1);
         
    }
    public static void fill2DMatrix(int[][]mat, int s, int[]arr){
         int row = mat.length;
        int col = mat[0].length;
        
        int rs = s - 1;
        int cs = s - 1;
        int re = row - s;
        int ce = col - s;
        
        int tes = 2*(re-rs) + 2*(ce-cs);
        
        int idx = 0;
        
        //left wall
        for(int i = rs; i <= re; i++){
           mat[i][cs] = arr[idx];
            idx++;
        }
        cs++;
        
        //bottom wall
        for(int i = cs; i <= ce; i++){
             mat[re][i] = arr[idx];
            idx++;
        }
        re--;
        //right wall
        for(int i = re; i >= rs; i--){
             mat[i][ce] = arr[idx];
            idx++;
        }
        ce--;
        //top wall
        for(int i = ce; i >= cs; i--){
             mat[rs][i] = arr[idx];
            idx++;
        }
        rs++;
    }
    public static void spiralArray(int[][]mat, int s, int r){
        //fill1DArray using s shell of matrix
        int[]arr = fill1DArray(mat, s);
        
        //rotate this 1D Array
        rotate(arr, r);
        
        //fill s shell of matrix with this sorted array
        fill2DMatrix(mat, s, arr);
    }

    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
