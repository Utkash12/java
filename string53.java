import java.util.Scanner;
public class string53{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sring to be changed: ");
        StringBuilder str=new StringBuilder(sc.nextLine());
        for(int i=0;i<str.length();i++){
            int asci=(char)str.charAt(i);
            if(asci>=97){
                asci=asci-32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
            else if(asci==32){
                asci=asci+0;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
            else if(asci<96){
                asci=asci+32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
             System.out.print(str.charAt(i));
        }
       
    }
}