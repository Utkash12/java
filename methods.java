public class methods{
    public static void main(String args[]){
        int x=200;
        int y=80;
        System.out.println(plusminus(x,y));
    }
    static int plusminus(int a,int b){
        int c;
            if(a>b){
                c=a+b;
            }
            else{
                c=a-b;
            }
            return c;
        }
}