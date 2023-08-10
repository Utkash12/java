import java.util.Scanner;
public class Stringreplace {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        System.out.println("Enter the string to be replaced: ");
        String str1=sc.nextLine();
        System.out.println("Enter the string to be replaced with: ");
        String str2=sc.nextLine();
        System.out.println(str.replace(str1,str2));
        for(int i=0;i<str.length()+1;i++){
            if(str.charAt(i)==str1.charAt(0)){
                if(str.substring(i,i+str1.length()).equals(str1)){
                    str=str.substring(0,i)+str2+str.substring(i+str1.length());
                }
            }
        }
    }
}
