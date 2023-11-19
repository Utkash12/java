import java.util.ArrayList;
public class arr79{
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+"  ");
        }
        System.out.println("  ");
        arr.add(1,100);
        System.out.println(arr);
        // System.out.println(arr.remove(arr.valueOf(100)));
        System.out.println(arr.remove(arr.indexOf(100)));
        // arr.valueOf(100);
    }
}