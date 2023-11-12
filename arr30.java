public class arr30{
    public static void main(String[] args){
        int[] arr={1,2,34,5,6,7,88,56,67,78};
        int max=0;
        int secmax=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            }
            else if(secmax<arr[i]){
                secmax=arr[i];
            }
        }
        System.out.println(secmax);
    }
}