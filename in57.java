// import java.util.Scanner;
// import java.util.Random;
// class game{
//     int user;
//     int comp;
//     int attempt;
//     public void ask(){
//         System.out.println("Enter the number: ");
//         Scanner sc=new Scanner(System.in);
//         this.user=sc.nextInt();
//     }
//     public void setuser(int usernum){
//         this.user=usernum;
//     }
//     public int getuser(){
//         return user;
//     }
//     game(int compnum){
//         Random rand=new Random();
//         this.comp=rand.nextInt(100);
//     }
//     public void setattempt(int attemptnum){
//         this.attempt=attemptnum;
//     }
//     public int getattempt(){
//         return attempt;
//     }
//     public int getcomp(){
//         return comp;
//     }
//     public boolean check(){
//         attempt++;
//         if(user==comp){
//             System.out.println("You guessed it right....");
//             return true;
//         }
//         else if(user>comp){
//             System.out.println("Too big....");
//         }
//         else{
//             System.out.println("Too small....");
//         }
//         return false;
//     }
// }
// public class in57{
//     public static void main(String[] args){
//         game g=new game();
//         boolean b=false;
//         while(!b){
//             g.ask();
//             b=g.check();
//         }
//     }
// }