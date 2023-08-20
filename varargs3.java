class varargs3{  
   
 static void display(String... values){  
    for(String s:values){  
        System.out.println(s);  
    }
 }  
  
 public static void main(String args[]){  
  
//  display();//zero argument   
 display("my","name","is","varargs");//four arguments  
 }   
}  
      