package com.suyal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;
import java.util.HashMap;
public class ListSetMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String>l=new ArrayList<String>();
       HashSet <String> s=new HashSet <String>();
       HashMap <String, String> m=new HashMap<String, String>();
       l.add("Avani");
       l.add("Suyal");
       l.add("Ananth");
       l.add("John");
       
       
       s.add("Avani");
       s.add("Suyal");
       s.add("Ananth");
       s.add("John");
       
       m.put("Avani","engineer");
       m.put("Suyal","intern");
       m.put("Ananth","manager");
       System.out.println(l);//order of insertion is maintained in list
       System.out.println(s);//order of insertion is not maintained
       System.out.println(m);//
	}

}
