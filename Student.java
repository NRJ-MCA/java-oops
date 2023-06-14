public class Student{
int id;
String name;
Student(){
System.out.println("this is a default constructor");
}
Student(int i,String n){
id=i;
name=n;
}
public static void main(String[]args){
Student s=new Student();
System.out.println("\n default constructor values \n");
System.out.println("student id:"+s.id+"\nstudent name:"+s.name);
System.out.println("\n parameterized constructor value:\n");
Student student=new Student(10,"david");
System.out.println("student id:"+student.id+"\n student name:\n"+student.name);
}
}