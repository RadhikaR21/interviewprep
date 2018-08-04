import java.util.Arrays;
import java.util.HashMap;
public class elemocconce {	
	void occonce(int[] arr)
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!hm.containsKey(arr[i]))
				hm.put(arr[i],1);				
			else
				hm.put(arr[i],hm.get(arr[i])+1);				
		}		
		for(int i=0;i<arr.length;i++){
			if(hm.get(arr[i])==1)
				System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		elemocconce eo=new elemocconce();
		int[] arr = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3};
		eo.occonce(arr);
	}

}
