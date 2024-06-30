public class s29 {

    public static void main(String[] args) {
        try {
            int data = 50 / 0; // may throw exception
        }
        // handling the exception by using Exception class
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("rest of the code");
    }

}