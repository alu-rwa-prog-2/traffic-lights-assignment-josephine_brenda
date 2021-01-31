import java.util.HashMap;

public class map {

	public static void main(String[] args) {
		  HashMap <Integer,String> map1 = new HashMap <Integer,String> ();
		  HashMap <Integer,String>map2 = new HashMap <Integer,String> ();
		  HashMap <Integer,String> map3 = new HashMap <Integer,String> ();
		  map1.put(1, "jose");
		  map1.put(2, "didi");
		  map1.put(3, "fofo");
		  System.out.println("\nValues in first map: " + map1);
		  map2.put(4, "gadi");
		  map2.put(5, "dada");
		  map2.put(6, "meme");
		  System.out.println("\nValues in second map: " + map2);
		  map3.put(7,"vivi");
		  map3.put(8,"ghaha");
		  System.out.println("\nValues in third map: " + map3);

		  // put all values in secondmap
		  map2.putAll(map1);
		  System.out.println("\nNow combined map1 and map2: " +map2);
		  //put all value of 
		  map3.putAll(map1);
		  System.out.println("\nNow combined map1 and map3: " +map3);
		  
	}
	}


