
public class oddoccuringno {	
	void countocc(int[] a)
	{	
		for(int i=0;i<a.length;i++)
		{   
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
					count++;
			}
			if(count/2==1)
				System.out.println(a[i]);
		}
	}	
	public static void main(String args[])
	{
		oddoccuringno oc=new oddoccuringno();
		int[] arr={2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
		oc.countocc(arr);
	}
}
