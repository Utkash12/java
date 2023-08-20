import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for the factorial: ");
        int num=sc.nextInt();
        int pro=1;
        if(num==0 || num==1){
            System.out.println(num);
        }
        else{
            for(int i=1;i<=num;i++){
                pro=pro*i;
            }
        }
        System.out.println(pro);
    }
}