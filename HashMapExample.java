import java.util.*;
public class HashMapExample {
	public static void main(String args[]) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(100,"Akash");
		hm.put(101,"Bharath");
		hm.put(102,"Chitti");

		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getValue());
		}
	}
}

	