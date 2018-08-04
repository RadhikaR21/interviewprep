import java.util.Scanner;

public class nbonacci {
	
	void printbonacci(int n,int m)
	{
		int[] arr=new int[m];
		for(int i=0;i<n-1;i++)
			arr[i]=0;
		arr[n]=1;
		
		for(int i=n;i<m;i++)
			{
			for(int j=i-n;j<i;j++)
			{
				arr[i]+=arr[j];				
			}			
			}
		for(int i=0;i<m;i++)
			System.out.print(arr[i]+" ");
		
	}
	

	public static void main(String args[])
	{
		nbonacci nb=new nbonacci();
		Scanner s=new Scanner(System.in);
		System.out.println("Input n and m");
		int n=s.nextInt();
		int m=s.nextInt();
		nb.printbonacci(n,m);
	}
}
