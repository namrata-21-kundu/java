import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ourRange, i, j, c;
        System.out.println("Enter the range: ");
        ourRange = sc.nextInt();
        for (i=2; i<= ourRange; i++){  //numbers till range 
            c =0 ;
            for(j = 1; j<= i; j++){     //checking divisibility
                if (i % j == 0){
                    c++;
                }
            }
            if (c ==2){         // number divisible by 1 and itself
                System.out.println(i + " ");
            }
        }
    }
}
