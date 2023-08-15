import java.util.Scanner;
public class string58{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to be checked: ");
        StringBuilder str=new StringBuilder(sc.nextLine());
        char ch;
        char dh;
        String ch1="";
        String dh1="";
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            ch1=ch1+ch;
        }
        for(int j=str.length()-1;j>-1;j--){
            dh=str.charAt(j);
            dh1=dh1+dh;
        }
        if(ch1.equals(dh1)){
            System.out.println("The string is pallindromic string.");
        }
        else{
            System.out.println("The string is not a pallindromic string.");
        }
        // if(ch==dh){
        //     System.out.println("The string is pallindromic string.");
        // }
        // else{
        //     System.out.println("The string is not a pallindromic string.");
        // }
        // if(ch==dh){
        //     System.out.println("The string is pallindromic string.");
        // }
        // else{
        //     System.out.println("The string is not a pallindromic string.");
        // }
        // boolean flag=false;

        // for(int k=0;k<str.length();k++){
        //     if(ch==dh){
        //         flag=true;
        //     }
        //     else{
        //         flag=false;
        //         break;
        //     }
        // }
        // if(flag==false){
        //     System.out.println("The string is pallindromic string.");
        // }
        // else{
        //     System.out.println("The string is not a pallindromic string.");
        // }
    }
}