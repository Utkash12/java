public class array18 {
    public static void main(String[] args){
        int [] arr={1,2,3,4,5,6,7};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
            }
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
}
