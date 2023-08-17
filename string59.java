import java.util.Scanner;
public class string59{

    public static boolean isPallindrome(StringBuilder str){
        int i=0;
        int j=str.length()-1;
        boolean flag=true;
        while(j>i){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else{
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to be checked: ");
        StringBuilder str=new StringBuilder(sc.nextLine());
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length()+1;j++){
                StringBuilder subStr=new StringBuilder(str.substring(i,j));
                if(isPallindrome(subStr)){
                    // System.out.println(subStr);
                    count++;
                }
            }
        }
        System.out.println("The number of pallindromic substrings are: "+count);
    }
}