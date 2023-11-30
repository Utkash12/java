//remove duplicate charfacters from a string
public class str19{
    public static void main(String[] args){
        String str="aaabbddeeeffghhiabhjj";
        for(int i=0;i<str.length();i++){
            int flag=0;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.print(str.charAt(i));
            }
        }
    }
}