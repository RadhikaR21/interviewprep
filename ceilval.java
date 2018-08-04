
public class ceilval {

	void findceil(int a,int b)
	{
		if(a%b!=0)
			System.out.print(a/b+1);
		else
		System.out.print(a/b);
	}
	
	public static void main(String[] args) {
	ceilval c=new ceilval();
	c.findceil(21,17);
	}
}
