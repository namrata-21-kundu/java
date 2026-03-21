import java.util.*;

public class MatrixElementSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read matrix dimensions
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // Read matrix
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Read target number
        int x = sc.nextInt();
        
        // YSearching element x
        for(int i=0; i<n ; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == x){
                    System.out.println(i+" "+j);
                }
            }
        }

        sc.close();
    }
}