
class duplicatearr {
  
  void closestpair(int[] arr,int k)
  {
    int res=0;
    for(int i=0;i<arr.length;i++)
    {
      while(i<=i+k)
      {
        int j=i+1;
        if(arr[i]==arr[j])          
        res=1;
        j++;
      }
    }
    if(res==1)
      System.out.print(true);
    else
      System.out.print(false);
  }
  
  public static void main(String[] args) {
    duplicatearr a=new duplicatearr();
    int[] inp={1,2,3,4,1,2,3,4};
    a.closestpair(inp,4);
    
  }
}
