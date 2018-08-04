
public class maxprodsubarr {

	void getmaxprod(int[] arr)
	{
		int prod=1,max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			prod*=arr[i];
			if(prod>max)
				max=prod;
			
		}
		System.out.print(max);		
	}	
	
	public static void main(String[] args) {
	maxprodsubarr mp=new maxprodsubarr();
	int[] arr={-1,-3,-2};
	mp.getmaxprod(arr);
	}
}
