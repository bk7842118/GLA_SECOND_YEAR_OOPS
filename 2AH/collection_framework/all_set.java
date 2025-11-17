import java.util.*;
public class all_set
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer>list=new ArrayList<>();
		for(int i=0;i<n;i++){
		    int x=sc.nextInt();
		    list.add(x);
		}
		Set<Integer>st1=new HashSet<>(list);
		Set<Integer>st2=new LinkedHashSet<>(list);
		Set<Integer>st3=new TreeSet<>(list);
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		st1.add(10000);
		st1.remove(5);
		for(int x:st1){
		   System.out.print(x+" ");
		}
	}
}
