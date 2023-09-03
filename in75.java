interface camera{
    void takeSnap();
    void recordVideo();
}
interface wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class cellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class smartPhone extends cellPhone implements camera,wifi{
    public void takeSnap(){
        System.out.println("Taking snap....");
    }
    public void recordVideo(){
        System.out.println("Recording video....");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks....");
        String[] networkList={"Harry","Prashant","Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
}
public class in75{
    public static void main(String[] args){
        smartPhone s=new smartPhone();
        String[] ar=s.getNetworks();
        for(String item:ar){
            System.out.println(item);
        }
    }
}