class Student{  
int rollno;  
String name;  
float fee;  
Student(int roll,String na,float fe){  
rollno=roll;  
name=na;  
fee=fe;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
class test2{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit",5000f);  
Student s2=new Student(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  