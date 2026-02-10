/*
binary search - >

*/
import java.util.Scanner;
//0 - not found
//1 - found
public class BinarySearch {
    public static int searching(int[] numberslist, int element){
        int left, right, mid;
        left = 0;
        right= numberslist.length - 1;
        while (left<=right){
            mid = (left+right)/2;
            if(numberslist[mid]==element){
                return 1;
            }
            else if (numberslist[mid] < element){
                right = numberslist[mid];
            }
            else if (numberslist[mid]>element){
                left= numberslist[mid];
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n, findme, found;
        System.out.println("Enter how many numbers for array? ");
        n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("enter elements in ascending order---");
        for (int i =0; i<n; i++){
            System.out.println("enter element: ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter element to search : ");
        findme = sc.nextInt();
        found = searching(numbers, findme);
        if (found==0){
            System.out.println("not found");
        }
        else{
            System.out.println("found");
        }
    }
}
