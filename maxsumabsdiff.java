import java.util.*;
class maxsumabsdiff {  
  public void maxdiff(int[] arr)
  {
    int[] res=new int[arr.length];
    Arrays.sort(arr);
    
    if(arr.length%2==0)
    {
    int s=0,l=arr.length-1;
    for(int i=0;i<arr.length;i+=2)
    {
    	res[i]=arr[l];
    	res[i+1]=arr[s];
    	l--;s++;
    }
    }
    else
    {
    	int s=0,l=arr.length-1;
        for(int i=0;i<arr.length-1;i+=2)
        {
        	res[i]=arr[l];
        	res[i+1]=arr[s];
        	l--;s++;
        }
    	res[arr.length-1]=arr[arr.length/2];
    }
    
    for(int i=0;i<arr.length;i++)
    {
    	System.out.print(res[i]);
    }
    
    
    int maxsum=0;
    for(int i=0;i<arr.length-1;i++)
    {
      maxsum+=Math.abs(res[i]-res[i+1]);
    }
    maxsum+=Math.abs(res[arr.length-1]-res[0]);
    
    System.out.println(maxsum);
  }
  
  public static void main(String[] args) {
    maxsumabsdiff  m=new maxsumabsdiff();
    int[] ip={1,2,5,3,4,6,7};
    m.maxdiff(ip);
    
  }
}
