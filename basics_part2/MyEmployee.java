import java.util.Scanner;
public class MyEmployee {
   int net_salary;
    public int net_salary(int salary, int tax){
        net_salary = salary - tax;
        return net_salary;
    }
    
    public char grade(char empGrade){
        return empGrade;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MyEmployee emp = new MyEmployee();
        
        int salary, tax;
        System.out.println("Enter salary: ");
        salary = sc.nextInt();

        System.out.println("Enter tax: ");
        tax = sc.nextInt();

        int net = emp.net_salary(salary, tax);
        System.out.println("Net Salary= " + net );

        System.out.println("Enter grade: ");
        char gradeEmp = sc.next().charAt(0);
        char g = emp.grade(gradeEmp);
        System.out.println("Employee grade: "+ g);


        sc.close();
    }
}
