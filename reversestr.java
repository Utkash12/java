import java.util.Scanner;
public class reversestr {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      StringBuilder str=new StringBuilder(sc.nextLine());
      int leng=str.length();
      for(int i=leng-1;i>-1;i--){
          System.out.print(str.charAt(i));
      }
        System.out.println();
      StringBuilder str1=new StringBuilder("this is me");
      str1.setCharAt(0,'T');
      System.out.println(str1);

    //   StringBuilder str2=new StringBuilder("this is me");
    //   str2.toToggleCase();
    }
}