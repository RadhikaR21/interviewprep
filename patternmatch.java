
public class patternmatch {

	void match(String a,String b)
	{
		int count=0;
		int m=a.length();
		int n=b.length();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a.charAt(i)==b.charAt(j))
				{
					count++;
				}
				if(count==n)
					System.out.println("Pattern found at index "+(i-2));
			}		
				
		}
	}
	
	public static void main(String args[]){
		patternmatch pm=new patternmatch();
		String txt="This is a book";
		String pattern="book";
		pm.match(txt,pattern);
	}
}
