import java.util.Scanner;
public class bank{
    public static void activity(int amount){
        System.out.println("1. Deposit\n2. Withdraw \n3. Check balance \n4. Exit\n");
        int choice;
        Scanner sc = new Scanner(System.in);
       
        do{
            System.out.println("\n\nEnter your choice 1, 2, 3 or 4 : ");
            choice= sc.nextInt();
            switch(choice){
                case 1:
                {
                    int extra;
                    System.out.println("Enter the amount to deposit: ");
                    extra = sc.nextInt();
                    amount+=extra;
                    System.out.println("Amount debited!");
                    break;
                }
                case 2:
                {
                    int extra_w;
                    System.out.println("Enter the amount to withdraw: ");
                    extra_w = sc.nextInt();
                    amount-=extra_w;
                    System.out.println("Amount withdrawn!");
                    break;
                }
                case 3:
                    System.out.println("Balance in Account: "+amount);
                    break;
                case 4:
                    System.out.println("You are exiting the bank system----");
                    System.exit(0);
                default:
                    System.out.println("Wrong choice!!");
            }
        } while (choice!= 4);
    }
    public static void main(String[] args){
        int amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial amount of the account: ");
        amount = sc.nextInt();
        activity(amount);
    }
}
