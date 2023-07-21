public class array20 {
    public static void main(String[] args){
        int [] arr={1,2,3,4,2,52,2,3,2};
        int [] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=2){
                arr2[i]=arr[i];
            }
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
