import java.util.Scanner;
import java.util.Random;
public class rock{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for rock");
        System.out.println("Enter 2 for paper");
        System.out.println("Enter 3 for scissor");
        int user=sc.nextInt();
        
        
        
        Random rand=new Random();
        int comp=rand.nextInt(3);
        
        
        if(user==comp){
            System.out.println("Draw");
        }
        else if(comp==1 && user==2 || comp==1 && user==3 || comp==2 && user==1 || comp==3 && user==2){
            System.out.println("Computer wins!!");
        }
        else if(user==1 && comp==2 || user==1 && comp==3 || user==2 && comp==1 || user==3 && comp==2){
            System.out.println("You win!!");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}