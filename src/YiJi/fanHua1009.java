package YiJi;

import java.util.Scanner;

public class fanHua1009 {
	public static void main(String[] args)
	  {
	    Scanner in=new Scanner(System.in);
	    String str=in.nextLine();
	    String[] words=str.split(" ");
	    String temp;
	    int begin=0;
	    int end=words.length-1;
		while(begin<end)
		{
			 temp=words[begin];
			 words[begin]=words[end];
			 words[end]=temp;
			 begin++;
			 end--;
	     }
		for(int i=0;i<words.length;i++)
	    {   
	    	if(i!=words.length-1)
	    	System.out.print(words[i]+" ");
	    	else
	    		System.out.print(words[i]);
	    }
	    in.close();
	  }
			 
}
