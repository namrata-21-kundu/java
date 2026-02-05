package ass2;
import java.util.Scanner;
public class factorial {
    int num;
    int fact=1;
    public void factorialOfNUmber(int n){
        num = n;
    }

    public void calculation(){
        for (int i = 1; i<= num; i++){
            fact*=i;
        }
    }

    public void display(){
        System.out.println("Factorial of "+num+ " is "+fact);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        factorial obj = new factorial();
        obj.factorialOfNUmber(num);
        obj.calculation();
        obj.display();
    }
}