
public class minswap {

	void minswapreq(int[] a)
	{
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{
			if((a[i]==0)&&(a[i+1]==1))
			{
				count++;
			}
		}
		System.out.println(count);
	}	
	
	public static void main(String args[])
	{
		minswap ms=new minswap();
		int[] a={ 0, 0, 1, 0, 1, 0, 0, 0 };
		ms.minswapreq(a);
	}
}
