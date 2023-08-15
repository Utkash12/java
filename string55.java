import java.util.Scanner;
public class string55{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string for the substring: ");
        StringBuilder str=new StringBuilder(sc.nextLine());
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length()+1;j++){
                for(int k=i;k<j;k++){
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
    }
}