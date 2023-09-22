import java.util.Scanner;
import java.util.Stack;
public class st14{
    public static bool 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the string: ");
        String st=sc.nextLine();
        System.out.println(st);
        int x=st.length();
        for(int i=0;i<x;i++){
            System.out.println(st.charAt(i));
        }
    }
}