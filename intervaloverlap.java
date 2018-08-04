import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Interval {
	int start;
	int end;
	Interval()
	{
		start=0;
		end=0;
	}	
	Interval(int s,int e)
	{
		start=s;
		end=e;
	}
	
	boolean compareInterval(Interval i1,Interval i2)
	{
		return (i1.start>i2.start)?true:false;
	}
}



public class intervaloverlap {


	public static void main(String args[])	
	{
		
		Interval[] interval=new Interval[4];
		interval[0]=new Interval(1,3);
		interval[1]=new Interval(1,7);
		interval[2]=new Interval(4,8);
		interval[3]=new Interval(2,5);	
		
		
		for (int i = 0; i < interval.length; i++)
            System.out.println(interval[i].start);
		
		//io.findint(interval);
		
		
	}
}
