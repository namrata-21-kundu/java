import java.util.Scanner;

public class Multidimensional_usingRandom {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows, cols, randomNos;
        randomNos = 0;

        System.out.println("enter rows and columns");
        rows = sc.nextInt();
        cols = sc.nextInt();

        int[][] arr = new int[rows][cols];  //2D array 

        for (int i =0; i<rows; i++){
            for(int j=0;j<cols; j++){
                arr[i][j] = (int)(Math.random() * 100);     //by default random gives datatype double decimal ans, so * 100, and type cast int
            }
        }

        /*for(int i =0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/

        for(int n[] : arr){     //row access
            for(int m : n){     //element of each row
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

}
