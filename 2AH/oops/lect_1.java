import java.util.*;
class student{
    String name="arjun";
    int age=20;
    int marks=9;
    public static void student_cllge(){
        System.out.println("gla university");
    }
     public  void student_detail(){
        System.out.println("his name is "+name);
    }
}
public class lect_1
{
	public static void main(String[] args) {
		student s1=new student();
		student s2=new student();
		System.out.println(s1.name);
		System.out.println(s2.name);
		s2.name="jai";
		System.out.println(s1.name);
		System.out.println(s2.name);
		s1.student_cllge();
		s2.student_cllge();
	    s1.student_detail();
	    s2.student_detail();
		
		
	}
}
