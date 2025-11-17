
import java.util.*;
public class intersection_of_two_arraylist
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		ArrayList<Integer>list1=new ArrayList<>();
		for(int i=0;i<n1;i++){
		    int x=sc.nextInt();
		    list1.add(x);
		}
		int n2=sc.nextInt();
		ArrayList<Integer>list2=new ArrayList<>();
		for(int i=0;i<n2;i++){
		    int x=sc.nextInt();
		    list2.add(x);
		}
		Set<Integer>ans=new HashSet<>();
	    for(int i=0;i<list1.size();i++){
	        if(list2.contains(list1.get(i))==true){
	            ans.add(list1.get(i));
	        }
	    }
	    System.out.println(ans);
	}
}
