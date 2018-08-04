class prefixsum {
  
  void getsum(int[][] arr,int n,int m)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
        if(i==0 && j==0)
          arr[i][j]=arr[i][j];
        if(i!=0 && j==0)
          arr[i][j]+=arr[i-1][j];
        if(i==0 && j!=0)
          arr[i][j]+=arr[i][j-1];
        if(i!=0 && j!=0)
          arr[i][j]+=arr[i-1][j]+arr[i][j-1]-arr[i-1][j-1];
      }
    }
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
    	  System.out.print(arr[i][j]+" ");
      }
      System.out.println();
     }
  }
  
  public static void main(String[] args) {
    prefixsum ps=new prefixsum();
    int[][] arr={{10,20,30,1,1},{5,10,20,1,1},{2,4,6,1,1},{2,4,7,1,1},{1,1,1,1,1}};
    ps.getsum(arr,5,5);
  }
  
}
