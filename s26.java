// try and catch
public class s26{
    public static void main(String[] args){
        try{
            int a=10;
            int b=20;
            int c=a/b;
            System.out.println(c);
        }
        // catch(Exception e){
        //     System.out.println("Error: "+e.getMessage());
        // }
        // finally{
        //     System.out.println("Finally block");
        // }
        catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        // finally{
        //     System.out.println("Finally block");
        // }


    }
}