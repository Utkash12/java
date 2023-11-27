// public class str8{
//     public static void main(String[] args){
//         String str="abcdefgh";
//         // for(int i=0;i<str.length()+1;i++){
//         //     System.out.println(str.substring(0,i));
//         // }
//         // for(int i=str.length();i>0;i--){
//         //     System.out.println(str.substring(0,i));
//         // }
//         for(int i=0;i<str.length();i++){
//             for(int j=i+1;j<str.length()+1;j++){
//                 System.out.println(str.substring(i,j));
//             }
//         }
//     }
// }
public class str8{
    public static void main(String[] args){
        String str="abcdefgh";
        for(int i=0;i<str.length()+1;i++){
            for(int j=i+1;j<str.length()+1;j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}