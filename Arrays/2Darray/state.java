package Arrays.2Darray;

public class state {
    public static void main(String[] args) throws Exception {
        // write your code here
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        diagonal(arr);
    }
    public static void diagonal(int[][]arr){
        int n = arr.length;
        
        for(int d = 0; d < n; d++){
            for(int r = 0, c = d; c < n; r++, c++){
                System.out.println(arr[r][c]);
            }
        }
    
    }

}
