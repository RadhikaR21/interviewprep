
public class containsno {

	void contain(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{			
			{
				System.out.print(arr[i]^1);
			}
		}
	}
	
	public static void main(String[] args) {
	containsno c=new containsno();
	int[] arr={4};
	c.contain(arr);
	}
}
