public class s27 {
    public static void main(String[] args){
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch(Exception f){
            System.out.println("Error: "+ f);
        }
        finally{
            System.out.println("Finally block");
        }
    }
}
