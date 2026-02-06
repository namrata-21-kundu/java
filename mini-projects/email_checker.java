/*
Email Checker where user needs to enter the number of data entries. Enter name of student and email id.
If email id contains "@" and "gmail.com" status is displayed valid, otherwise status is displayed as invalid.
Uses concepts of classes and objects, array of objects, methods and constructors.
*/

import java.util.Scanner;
public class email_checker {
    String s_name, email;

    //Constructor
    email_checker(String name, String mail){
        s_name= name;
        email = mail;
    }
    
    //Method for displaying student name and email id
    public void display(){
        System.out.println("\nName: " + s_name + "\nEmail ID: " + email);
    }

    public boolean validityChecker(){
        return email.contains("@") && email.endsWith("gmail.com");
    }

    public static void main(String[] args){
        int n;
        String studentName, emailId;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many entries (enter in digits): ");
        n = sc.nextInt(); 

        sc.nextLine();  //buffer clear

        email_checker[] listOfObj = new email_checker[n];   

        //Input Loop
        for (int i =0; i<n; i++){
            System.out.println("Enter name of student: ");
            studentName = sc.nextLine();
            System.out.println("Enter email: ");
            emailId= sc.nextLine();

            listOfObj[i] = new email_checker(studentName, emailId);
        }

        //Display all data entered
        System.out.println("\n======Student Details======\n");
        for (email_checker e : listOfObj){
            e.display();
        }

        //Display all data with Status as valid or invalid
        System.out.println("\n======Valid Email with Names======\n");
        for (email_checker obj : listOfObj){
            obj.display();
            if(obj.validityChecker()){
                System.out.println("Status = Valid");
            }
            else{
                System.out.println("Status = Invalid");
            }
        }

        //Close scanner to prevent resource leaks
        sc.close(); 
    } 
}
