import java.util.Scanner;
class UnderAgeException extends Exception{
    UnderAgeException(String msg){
        super(msg);
    }
}
class CheckAge{
    public void age(int a) throws UnderAgeException{
        if (a<18){
            throw new UnderAgeException("you cannot vote kid!");
        }
        else{
            System.out.println("vote for your right adult!");
        }
    }
}
public class EligibleToVote{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int myage= sc.nextInt();
        CheckAge obj = new CheckAge();
        try{
            obj.age(myage);
        }
        catch(UnderAgeException e){
            System.out.println(e.getMessage());
        }
    }
}