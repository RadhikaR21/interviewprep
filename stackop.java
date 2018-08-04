
public class stackop {

	//array implementation of stack
	public static int MAX=1000;
	int top;
	int[] stack=new int[MAX];
	
	stackop()
	{
		top=-1;
	}
	
	boolean isEmpty()
	{
		return(top<0);
	}
	
	boolean push(int value)
	{
		if(top>=MAX)
		{
			System.out.println("Stack overflow");
			return false;
		}
		else
		{
			stack[++top]=value;
			return true;
		}
		
	}
	
	int size()
	{
		return top+1;
	}
	
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else
		{
			int val=stack[top--];
			return val;
		}
	}
	
	
	
	public static void main(String args[])
	{
		stackop st=new stackop();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		//System.out.println("Popped element is "+st.pop());
		System.out.println(st.size());
	}
	
}
