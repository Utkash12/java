import java.util.Scanner;
public class string57{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to be checked: ");
        StringBuilder str=new StringBuilder(sc.nextLine());
        int i=0;
        int j=str.length()-1;
        boolean flag=true;
        while(j>i){
            if(str.charAt(i)==str.charAt(j)){
                flag=true;
            }
            else{
                flag=false;
                break;
            }
            i++;
            j--;
        }
        if(flag==true){
            System.out.println("The string is a pallindromic string: ");
        }
        else{
            System.out.println("The string is not a pallindromic string: ");
        }
    }
}