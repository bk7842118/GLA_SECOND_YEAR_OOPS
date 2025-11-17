class student{
    String name;
    private int age;
    // constructor
    student(String name,int a){
        this.name=name;
        age=a;
    }
    // getter and setter
    public void setage(int age) throws Exception{
        if(age<0){
            // System.out.println("age can't be negative");
            throw new Exception("age can't be negative");
            // return;
        }
        this.age=age;
        
    }
    public int getage(){
        return age;
    }
}
public class lect
{
	public static void main (String[] args) throws Exception{
		student s1=new student("jalaj",20);
		System.out.println(s1.getage());
		// s1.setage(-20);
		System.out.println(s1.getage());
		try{
		   int a=10/0;
		}catch(Exception e){
		    System.out.println(e.getMessage());
		    e.printStackTrace();
		}finally{
		    System.out.println("always executed");
		}
	}
}
