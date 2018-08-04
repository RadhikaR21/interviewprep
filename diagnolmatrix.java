
public class diagnolmatrix {
	
		  
		  public void reverse(int[][] mat)
		  {
		    int i=0,j=mat.length;
		    while(i<j){
		    swap(mat[i][i],mat[j-1][j-1]);
		    swap(mat[i][j-1],mat[j-1][i]);
		    i++;
		    j--;
		    }
		    for(int i1=0;i1<mat.length;i1++)
		    {
		      for(int j1=0;j1<mat[i].length;j1++)
		      {
		        System.out.print(mat[i][j]);
		      }
		    }
		  }
		  void swap(int a,int b)
		  {
		    int temp=a;
		    a=b;
		    b=temp;
		  }
		  
		  public static void main(String[] args) {
		    diagnolmatrix dm=new diagnolmatrix();
		    int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
		    dm.reverse(mat);
		    
		  }
		}


