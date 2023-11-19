import java.util.*;
public class cl1{
    public static void main(String[] args){
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Hello");
        arr.add("World");
        arr.add("How");
        arr.add("Are");
        arr.add("You");
        Collections.sort(arr);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
    }
}