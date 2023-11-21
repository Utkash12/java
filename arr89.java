public class arr89{
    public static void main(String[] args){
        int[] arr={1,23,54,32,12,87,67,56,43,22,11};
        for(int i=0;i<arr.length;i++){
            int j=i-1;
            int current=arr[i];
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"   ");
        }
    }
}