import java.util.Random;
import java.util.Scanner;
class game{
    int user;
    int comp;
    int attempt;
    public void ask(){
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        this.user=sc.nextInt();
    }
      public void setUser(int userinput){
        this.user=userinput;
    }
    public int getUser(){
        return user;
    }
    public void setcomp(int compinput){
        this.comp=compinput;
    }
    public int getcomp(){
        return comp;
    }
    public void setattempt(int attemptinput){
        this.attempt=attemptinput;
    }
    public int getattempt(){
        return attempt;
    }
    game(){
        Random rand=new Random();
        this.comp=rand.nextInt(100);
    }
    public boolean isCorrectNumber(){
        attempt++;
        if(user==comp){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", comp, attempt);
            return true;
        }
        else if(user<comp){
            System.out.println("Too low....");
        }
        else if(user>comp){
            System.out.println("Too high....");
        }
        return false;
    }
}
public class in54{
    public static void main(String[] args) {
        game g=new game();
        boolean b=false;
        while(!b){
            g.ask();
            b=g.isCorrectNumber();
        }
    }
}