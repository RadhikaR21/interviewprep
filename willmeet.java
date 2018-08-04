import java.util.Scanner;

public class willmeet {

	boolean meet(int x1,int v1,int x2,int v2)
	{
		if(x1>x2 && v1>v2)
			return false;
		if(x2>x1 && v2>v1)
			return false;
		
		if(x1>x2)
		{
			swap(x1,x2);
			swap(v1,v2);
		}
		
		while(x1>=x2){
			if(x1==x2)
				return true;
		x1+=v1;
		x2+=v2;
		}
		return false;			
	}
	
	void swap(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
	}	
	
	public static void main(String args[])
	{
		willmeet w=new willmeet();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter values for x1,v1,x2,v2 :");
		int x1=s.nextInt();
		int v1=s.nextInt();
		int x2=s.nextInt();
		int v2=s.nextInt();
		Boolean result=w.meet(x1,v1,x2,v2);
		System.out.println(result);
	}
}
