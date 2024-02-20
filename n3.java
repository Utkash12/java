public class n3 {
    public static void main(String[] args){
        int r=5;
        int c=5;
        for(int i=0;i<r;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<c-i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
