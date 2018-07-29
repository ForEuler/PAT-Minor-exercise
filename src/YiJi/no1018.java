package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class no1018 {
public static void main(String[] args) throws IOException
{
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	int number=Integer.parseInt(in.readLine());
	int countf=0;
	int fJ=0;
	int fB=0;
	int fC=0;
	int counts=0;
	int sJ=0;
	int sB=0;
	int sC=0;	
	for(int i=0;i<number;i++)
	{
		String[] temp=in.readLine().split(" ");
		if(temp[0].equals("J"))
	    {
	    	if(temp[1].equals("B"))
	    		{countf++;fJ++;}
	    	else if(temp[1].equals("C"))
	    		{counts++;sC++;}
	    		
	    }
	    else if(temp[0].equals("B"))
	    {
	    	if(temp[1].equals("C"))
	    		{countf++;fB++;}
	    	else if(temp[1].equals("J"))
	    		{counts++;sJ++;}
	    }
	    else if(temp[0].equals("C"))
	    {
	    	if(temp[1].equals("J"))
	    		{countf++;fC++;}
	    	else if(temp[1].equals("B"))
	    		{counts++;sB++;}
	    }
	    
	}
	System.out.println(countf+" "+(number-countf-counts)+" "+counts);
	System.out.println(counts+" "+(number-countf-counts)+" "+countf);
	System.out.print(Max(fB,fC,fJ)+" "+Max(sB,sC,sJ));	
 }
    static String Max(int B,int C,int J){
    	if(B>=J)
    	{
    		if(B>=C)
    		return "B";
    		else
    		return "C";  			
    	}
    	else 
    	{
    		if(C>=J)
    			return "C";
    		else
    			return "J";
    	}
	
}
}
