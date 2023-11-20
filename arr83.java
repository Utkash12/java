public class arr83{
    public static void main(String[] args){
        int[] arr={1,4,3,87,65,54,34,65,12,90};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];  //c=a
                    arr[j]=arr[j+1];  //a=b
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"   ");
        }
    }
}