import java.util.Scanner;
public class string54{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string for the substring: ");
        StringBuilder str=new StringBuilder(sc.nextLine());
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length()+1;j++){
                System.out.println(str.substring(i,j));
            }
            System.out.println();
        }
    }
}