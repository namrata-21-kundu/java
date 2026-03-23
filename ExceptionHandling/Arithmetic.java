import java.util.Scanner;
public class Arithmetic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no: ");
        int first = sc.nextInt();
        System.out.println("Enter second no: ");
        int second = sc.nextInt();
        try{
            System.out.println(first/second);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}