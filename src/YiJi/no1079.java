package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1079 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String s1=in.readLine();
		in.close();
		int count=0;
		while(isRes(s1)!=true&&count<10)
		{
			StringBuffer s2=new StringBuffer(s1);
		    s2.reverse();
		    int n1=Integer.parseInt(s1);
		    int n2=Integer.parseInt(String.valueOf(s2));
		    System.out.println(n1+" + "+n2+" = "+(n1+n2));
		    s1=Integer.toString(n1+n2);
		    count++;
		}
		if(count!=10)
		System.out.print(s1+" is a palindromic number.");
		else
		System.out.print("Not found in 10 iterations.");	
		
	}
	public static boolean isRes(String s) {
		int len=s.length();
		int i=0;
		int j=len-1;
		while(i<=j&&i<len&&j>=0)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
