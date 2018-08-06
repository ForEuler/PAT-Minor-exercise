package YiJi;

import java.util.Scanner;

public class no1029 {
	public static void main(String[] args) 
	  {
	   Scanner in = new Scanner(System.in);
	   String input=in.next().toUpperCase();
	   String output=in.next().toUpperCase();
	   in.close();
	   int i=0;
	   int j=0;
	   String result ="";
	   int inputlength=input.length();
	   int outputlength=output.length();
	  while(i<inputlength&&j<outputlength)
	  {
		  char temp=input.charAt(i);
		  if(temp!=output.charAt(j))
		  {
			  i++;
			 if(result.contains(temp+"")==false)
				 result+=temp+"";				 
		  }
		  else
		  {
			  i++;
			  j++;
		  }
			  
	  }
	 
	while(i!=inputlength)
	{
		 char temp=input.charAt(i);
		  if(result.contains(temp+"")==false)
			  result+=temp+"";
		  i++;
	  }
      System.out.print(result);
	  }
}
