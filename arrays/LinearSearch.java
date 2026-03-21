import java.util.Scanner;

public class LinearSearch {
    public static int findElement(int n, int[] arr, int x) {
        // Linear Search 
        for(int i=0; i< arr.length; i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //array size input
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {   //array input
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(findElement(n, arr, x));
        sc.close();
    }
}