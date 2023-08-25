class ParentClass   
{  
    ParentClass()  
    {  
        System.out.println("ParentClass constructor executed.");  
    }  
}    
class ChildClass extends ParentClass   
{ 
    ChildClass()  
    {  
        System.out.println("ChildClass constructor executed.");  
    }  
}  
public class OrderOfExecution
{  
    public static void main(String ar[])   
    {   
        System.out.println("Order of constructor execution...");  
        // new ChildClass();
        ChildClass c = new ChildClass();
            
    }  
}  