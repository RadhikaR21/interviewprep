import java.util.*;
public class noofsubstr {		
	int noofsub(String s)
	{
		int count=0;
		int len=1,n=s.length();
		HashSet<String> set=new HashSet<String>();
		while(len<=n){
		for(int i=0;i<n;i+=len)
		{
			if(i+len>n-1)
				break;
			if(!set.contains(s.substring(i,i+len)))
			{
			set.add(s.substring(i,i+len));
			count++;			
			}	
			
		}	
		len++;
		}
		
		for(String k:set)
		{
			System.out.println(k);
		}
		return count;
	}
	
	public static void main(String args[])
	{
		noofsubstr sb=new noofsubstr();
		String s="abcda";
		int n=sb.noofsub(s);
		//System.out.print(n);
	}
}
