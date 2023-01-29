public class colWiseTraversal {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        // 1 2 3
        // 4 5 6
        // 7 8 9        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }


        int[][] arr2 = {{1,2,3},{4,5,6}};
        // 1 2 3
        // 4 5 6
        // 2 * 3 matrix
        System.out.println("ARRAY 2 : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr2[j][i]);
            }
            System.out.println();
        }

    }
    
}
