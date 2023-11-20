//selection sort
public class arr87{
    public static void main(String[] args){
        int[] arr={1,21,43,65,76,22,44,53};
        int small=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[small]){
                    small=j;
                }
                int temp=arr[j];
                arr[j]=arr[small];
                arr[small]=temp;
            }
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+"   ");
        }
    }
}