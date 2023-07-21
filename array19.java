public class array19 {
    public static void main(String[] args){
        int [] arr={1,2,3,4,2,2,5,6,7};
        int [] arr2=new int[arr.length];
        int j=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=2){
                arr2[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
