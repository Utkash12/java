class bank{
    int interest(){
        return 0;
    }
}
class sbi extends bank{
    int interest(){
        return 7;
    }
}
class icici extends bank{
    int interest(){
        return 9;
    }
}
class axis extends bank{
    int interest(){
        return 11;
    }
}
public class in45{
    public static void main(String[] args){
        sbi sb=new sbi();
        icici ic=new icici();
        axis ax=new axis();
        System.out.println("Sbi rate of interest: "+sb.interest());
        System.out.println("icici rate of interest: "+ ic.interest());
        System.out.println("axis rate of interest: "+ax.interest());
    }
}