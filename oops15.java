import java.util.Scanner;
class square{
    public int area(int side){
        return side*side;
    } 
    public int perimeter(int side){
        return 4*side;
    }
}
public class oops15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the side: ");
        int side=sc.nextInt();
        square calc=new square();
        System.out.println("The area wil be "+calc.area(side));
        System.out.println("The perimeter will be "+calc.perimeter(side));
    }
}