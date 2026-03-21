import java.util.Scanner;
public class ArrayBasics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] listOfNumbers;
        int n;
        System.out.println("enter no of elements in array: ");
        n = sc.nextInt();
        listOfNumbers = new int[n];
        for (int i=0; i< n; i++){
            System.out.println("Enter element: ");
            listOfNumbers[i] = sc.nextInt();
        }
        for(int num : listOfNumbers){
            System.out.println(num);
        }
    }
}
