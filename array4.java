public class array4 {
    public static void main(String[] args){
        int [][] arr=new int[4][5];
        int value=1;
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(" "+value);
                value++;
            }
            System.out.print("\n");
        }
    }
}
