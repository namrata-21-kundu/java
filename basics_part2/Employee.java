import java.util.Scanner;
 class Employee {

    // Method to calculate net salary after tax deduction
    public double netSalary(double salary, double tax) {
        double netSalary = salary - tax;
        return netSalary;
    }

    // Method to return employee grade
    public String grade(String empGrade) {
        return empGrade;
    }

    // Main method for testing
    public static void main(String[] args) {
        
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        // Example values
        double salary = sc.nextDouble();
        double tax = sc.nextDouble();

        // Calling netSalary method
        double net = emp.netSalary(salary, tax);
        System.out.println("Net Salary: " + net);

        // Calling grade method
        String g = emp.grade("A");
        System.out.println("Employee Grade: " + g);
        
    }
}
