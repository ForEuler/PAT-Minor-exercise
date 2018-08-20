package YiJi;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class no1044 {
	 public static void main(String[] args) throws Exception {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        int N=Integer.parseInt(in.readLine());
	        String[] lowdigit= {"tret","jan", "feb", "mar", "apr", "may", "jun", "jly", "aug", "sep", "oct", "nov", "dec"};
	        String[] highdigit= {"","tam", "hel", "maa", "huh", "tou", "kes", "hei", "elo", "syy", "lok", "mer", "jou"};
	        for(int i=0;i<N;i++)
	        {
	        	
	        	String temp=in.readLine();
	        	if((temp.charAt(0)>='0')&&(temp.charAt(0)<='9'))
	        	{	
	        		int number=Integer.parseInt(temp);
	        		if(number>=13)
	        		System.out.print(highdigit[number/13]+" ");
	        		System.out.println(lowdigit[number%13]);
	        	}
	        	else
	        	{
	        		String[] number=temp.split(" ");
	        		if(number.length==1)
	        			{
	        			 if(indexOf(number[0],lowdigit)==-1)
	        				 System.out.println(indexOf(number[0],highdigit)*13); 
	        			 else
	        			  System.out.println(indexOf(number[0],lowdigit));        						
	        			}
	        		else
	        			 System.out.println(indexOf(number[0],highdigit)*13+indexOf(number[1],lowdigit));
	        			
	        	}
	        }
	        in.close();
	        
	 }

	
	private static int indexOf(String string,String[] digit) {
		int length=digit.length;
		for(int i=0;i<length;i++)
		{
			
			if(digit[i].equals(string))
		    return i;
		}
		return -1;
	}
}
