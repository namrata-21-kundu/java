import java.util.Scanner;
public class DividingWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int len = word.length()/n;
        for(int i = 0; i< word.length(); i+=len){
            System.out.println(word.substring(i,i+len));
        }
    }
}
