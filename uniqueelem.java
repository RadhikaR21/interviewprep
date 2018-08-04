import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class uniqueelem  {	
	
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	public void push(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	
	void uniqelem(Node head)
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		List<Integer> l=new ArrayList<Integer>();
		
		Node curr=head;
		while(curr.next!=null)
		{
			if(!hm.containsKey(curr.data))
			hm.put(curr.data, 1);
			else
			hm.put(curr.data, hm.get(curr.data)+1);			
			curr=curr.next;		
		}
		//System.out.println(Arrays.asList(hm));
		
		for(int i:hm.keySet())
		{
			if(hm.get(i).equals(1))
				l.add(i);
		}
		
		for(int i=0;i<l.size();i++)
			System.out.println(l.get(i));
	}

	public static void main(String[] args) {
		uniqueelem ue=new uniqueelem();
		
		ue.push(6);
		ue.push(2);
		ue.push(3);
		ue.push(1);
		ue.push(4);
		ue.push(5);
		ue.push(3);
		
		ue.uniqelem(ue.head);
	}

}
