import java.util.Scanner;
public class patt1{
    static void func(int inp,String str){
        for(int i=0;i<inp;i++){
            for(int j=0;j<i;j++){
                System.out.print(str);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int pat=sc.nextInt();
        System.out.println("Enter the pattern: ");
        String str=sc.next();
        func(pat,str);
    }
}