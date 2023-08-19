import java.util.Scanner;
public class even{
    static void evenodd(int num){
            if(num%2==0){
                System.out.println("The number is even");
            }
            else{
                System.out.println("The number is odd");
            }
        }
    public static void main(String[] args){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to be checked: ");
        int a=sc.nextInt();
        evenodd(a);
    }
}