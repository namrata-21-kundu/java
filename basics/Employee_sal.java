package basics;
import java.util.Scanner;
public class employee_sal {
    public static void main(String[] args){
        System.out.print("Enter salary of employee: ");
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        double incomeTax;
        if (salary <= 50_000){
            incomeTax=0;
        }
        else if (salary <= 60_000){
            incomeTax = 0.10 * salary;
        }
        else if (salary <= 150_000){
            incomeTax = 0.20 * salary;
        }
        else{
            incomeTax = 0.30 * salary;
        }
        System.out.println("Salary = " + salary + "\nIncome Tax =" + incomeTax);
    }
}
