import java.util.Scanner;
public class string6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to be printed: ");
        String str=sc.nextLine();
        System.out.println(str);
        String str1="THIS IS A STRING IN UPPERCASSE";
        System.out.println(str1.toLowerCase());
        String str2="this is a string in lowercase";
        System.out.println(str2.toUpperCase());
    }
}