public class n15 {
    public static void main(String[] args){
        int r=5;
        int n=r;
        for(int i=0;i<r;i++){
            for(int j=n;j<n-r+1;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
