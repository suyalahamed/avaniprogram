package com.suyal;
import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
	 Map <String,Object> map= new HashMap<String, Object>();
	 map.put("name", "suyal");
	 map.put("gender", "male");
	 System.out.println(map.get("name"));
	 for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
	   System.out.println(map.keySet()); 
	}
	

}
