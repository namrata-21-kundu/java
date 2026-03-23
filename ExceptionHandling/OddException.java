import java.util.Scanner;
class Checking{
    public static void check(int n) throws Exception{
        if(n%2 != 0){
                throw new Exception("Number is odd");
        }
        else{
                System.out.println("Number is even");
        }
    }
}
public class OddException {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        try{
            Checking.check(num);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
