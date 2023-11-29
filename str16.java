//print all the pallindromic substrings
public class str16{
    public static void main(String[] args){
        String str="abfhgcghdede";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String s=str.substring(i,j);
                int flag=0;
                // for(int k=0;k<s.length();k++){
                //     if(s.charAt(k)!=s.charAt(s.length()-k-1)){
                //         flag=1;
                //         break;
                //     }
                // }
                int first=0;
                int last=s.length()-1;
                while(first<last){
                    if(s.charAt(first)!=s.charAt(last)){
                        flag=1;
                        break;
                    }
                    first++;
                    last--;
                }
                if(flag==0){
                    System.out.print(s);
                    System.out.println(" ");
                }
            }
            System.out.println(" ");
        }
    }
}