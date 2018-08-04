import java.util.HashMap;

public class phonenos {

	
	public static void main(String[] args) {
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		hm.put("aaa",111);
		hm.put("bbb",222);
		hm.put("ccc",333);
		
		System.out.print(hm.keySet());
		System.out.println(hm.values());
		
		//print a particular value if key is given
		if(hm.containsKey("aaa"))
			System.out.println(hm.get("aaa"));
		
		//print key if value is given
		//if(hm.containsValue(222))	
			
			
			//remove a key
			System.out.println(hm.remove("aaa", 111));
			System.out.println(hm.keySet());
			
			//replace a key
			System.out.println(hm.replace("bbb", 222, 444));
			System.out.println(hm.values());
	}

}
