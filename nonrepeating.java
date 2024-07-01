//program to find the first non-repeating character in a string
import java.util.Scanner;
public class nonrepeating{
    public static void nonrepeat(String str1){
        int[] counng=new int[100];
        for(int i=0;i<str1.length();i++){
            counng[str1.charAt(i)]++;
        }
        for(int i1=0;i1<str1.length();i1++){
            if(counng[str1.charAt(i1)]==1){
                System.out.println("The first non-repeating element is: "+str1.charAt(i1));
                break;
            }
            else{
                System.out.println("There is no non-repeating element in the provided string.");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String to be checked: ");
        String str=sc.nextLine();
        nonrepeat(str);

    }
}