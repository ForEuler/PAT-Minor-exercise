package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1078 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String op=in.readLine();
		String str=in.readLine();
		in.close();
		int len=str.length();
		if(op.equals("C"))
		{
			int i=0;
			int j=0;
			while(i<len&&j<len)
			{
				while(j<len&&str.charAt(i)==str.charAt(j))
					j++;
				if(j-i>1)
				System.out.print(j-i);
				System.out.print(str.charAt(i));
				i=j;			
			}
		}
		else
		{
			int i=0;
			int j=0;
			while(i<len&&j<len)
			{
				if(Character.isDigit(str.charAt(j))==true)
				{
					while(j<len&&Character.isDigit(str.charAt(j))==true)
					j++;			
				    int num=Integer.parseInt(str.substring(i, j));	
				    for(int m=0;m<num;m++)
				    System.out.print(str.charAt(j));
					j++;
					i=j;
				}
				else
				{
					 System.out.print(str.charAt(j));
						j++;
						i=j;
		     	}			
			}
		}
			
			
    }
}
