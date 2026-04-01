import java.util.*;
public class Arraylist_intro {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(23);
        list.add(56);
        System.out.println(list);
        System.out.println(list.reversed());
        System.out.println(list.get(1));
    }
}
