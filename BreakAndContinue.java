package com.suyal;

public class BreakAndContinue {

	public static void main(String[] args) {
		// demo of difference between break and and continue
		//printing number from 1-10;
		
		for(int i=1;i<=10;i++)//this loop prints value from 1-10
		{
			System.out.print(i);
		}
		
            System.out.println();
		for(int i=1;i<=10;i++)//we want values till from 1-8
		{
			System.out.print(i);
			if (i==8)
				break; //it breaks the loop when condition is true
		}
		 System.out.println();
		for(int i=1;i<=10;i++)//we want to skip anything
		{
			
			if (i==8)
				continue; //when continue is encounterd  remainig lines in loop is skipped
			System.out.print(i);
		}

	}

}
