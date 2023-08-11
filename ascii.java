import java.util.Scanner;
public class ascii{
    public static void main(String[] args){
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        StringBuilder str=new StringBuilder(sc.nextLine());
        for(int i=0;i<str.length();i++){
            int index=str.charAt(i);
            System.out.println("ascii value for "+str.charAt(i)+" will be "+ index);
            if(index>=65 && index<=90){
                flag=true;
            }
            else if(index>=97 && index<=122){
                flag=false;
            }
        }
        if(flag==true){
            
        }
    }
}