import java.util.Scanner;
public class fibo12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lst number: ");
        int last=sc.nextInt();
        int first=0;
        int second=1;
        System.out.println(first);
        System.out.println(second);
        for(int i=0;i<=last;i++){
            int third=first+second;
            System.out.println(third);
            first=second;
            second=third;
        }
    }
}