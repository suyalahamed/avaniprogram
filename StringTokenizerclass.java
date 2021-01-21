package com.suyal;

import java.util.StringTokenizer;

public class StringTokenizerclass {

	public static void main(String[] args) {
		StringTokenizer st= new StringTokenizer("hai suyal how are you");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
