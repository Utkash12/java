public class arr91{
    public static void main(String[] args){
        int[] arr={1,34,45,76,33,22,11,88};
        int key=88;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Not found..");
        }
        else{
            System.out.println("Found..");
        }
    }
}