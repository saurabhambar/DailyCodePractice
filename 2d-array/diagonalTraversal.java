public class diagonalTraversal {

    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        // 1 2 3
        // 4 5 6
        // 7 8 9    

        for(int i=0;i<n;i++){
            System.out.print(arr[i][i]);
        }
        System.out.println();

        // 00 01 02
        // 10 11 12
        // 21 22 23
        for(int i=0;i<n;i++){
            System.out.print(arr[i][n-1-i]+ " ");
        }

    }
    
}
