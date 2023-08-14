import java.util.Scanner;
public class string52{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to be changed: ");
        StringBuilder str=new StringBuilder(sc.nextLine());
        int asci;
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            asci=(int)ch;
            boolean flag=true;
            // System.out.println("the ascii value for "+ ch +" will be: "+asci);
            // System.out.println();
            // System.out.println();
            if(asci>=97){
                flag=false;
            }
            if(flag==true){
                asci=asci+32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
            else{
                asci=asci-32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
            System.out.print(str.charAt(i));
        }
    }
}