import java.util.Scanner;
public class stringreplace1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to be replaced:");
        String str=sc.nextLine();
        System.out.println("enter the character to be replaced:");
        String old=sc.nextLine();
        System.out.println("enter the new character: ");
        String neww=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==old.charAt(0)){
                str=str.substring(0,i)+neww+str.substring(i+1);
            }
        }
       System.out.println(str);
    }
}
