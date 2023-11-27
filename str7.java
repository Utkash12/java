//reverse a string
public class str7{
    public static void main(String[] args){
        String str="abcdefgh";
        int first=0;
        int last=str.length()-1;
        char[] arr=str.toCharArray();
        while(first<last){
            char temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        System.out.println(arr);
    }
}