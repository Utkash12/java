public class ls1{
    public static void main(String[] args){
        int[] arr={1,89,56,67,34,22,56};
        int key=2;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                flag=1;
                break;
            }
            else{
                flag=0;
            }
        }
        if(flag==1){
            System.out.println("Element found ");
        }
        else{
            System.out.println("Element not found");
        }
    }
}