//first repeating number
public class arr32{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,2,4,8,10};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    System.exit(111);
                }
                // else{
                //     continue;
                // }
            }
        }
    }
}