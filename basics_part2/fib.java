import java.util.Scanner;
public class fib{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num: ");
        int num = sc.nextInt();
        int a , b, c;
        a = 0;
        b = 1;
        System.out.println(a + "\n"+ b);
        for (int i = 2; i<=num; i++){
            c = a + b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}