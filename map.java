import java.util.HashMap;
/**
*program to copy all of the mappings from the specified map to another map.
*Test it with three different maps.
* simply the program will copy map element into another
* @author  Josephine and Brenda
* @version 1.0
* @since   2014-03-31 
*/
public class map {

	public static void main(String[] args) {
		//create maps  
		  HashMap <Integer,String> map1 = new HashMap <Integer,String> ();
		  HashMap <Integer,String>map2 = new HashMap <Integer,String> ();
		  HashMap <Integer,String> map3 = new HashMap <Integer,String> ();
		//insert keys and values in first map
		  map1.put(1, "jose");
		  map1.put(2, "didi");
		  map1.put(3, "fofo");
		  System.out.println("\nValues in first map: " + map1);//this will print first map
		//insert elements in second map
		  map2.put(4, "gadi");
		  map2.put(5, "dada");
		  map2.put(6, "meme");
		  System.out.println("\nValues in second map: " + map2);//print second map
		  //insert values in third map
		  map3.put(7,"vivi");
		  map3.put(8,"ghaha");
		  System.out.println("\nValues in third map: " + map3);//print third map

		  // copy all mappings from map1 in second map
		  map2.putAll(map1);
		  System.out.println("\nNow combined map1 and map2: " +map2);
		  //put all value of map1 in map 3
		  map3.putAll(map1);
		  System.out.println("\nNow combined map1 and map3: " +map3);
		  
	}
	}


