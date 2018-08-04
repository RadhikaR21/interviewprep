import java.util.*;

public class minpair {
	
 void findminpair(int[] a)
 {
	 HashMap<Integer,Integer> h=new HashMap<>();
	 Arrays.sort(a);
	 int l=0,hi=a.length-1;
	 for(int i=0;i<a.length/2;i++)
	 {
		 h.put(a[l],a[hi]);
		 l++;
		 hi--;
	 }
	
	 System.out.println(Arrays.asList(h));
 }
	
 public static void main(String[] args) {
 minpair mp=new minpair();
 int[] arr={1,7,3,4};
 mp.findminpair(arr);
}
}
