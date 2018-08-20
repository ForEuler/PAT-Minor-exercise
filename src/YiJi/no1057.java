package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1057 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String string=in.readLine();
		in.close();
		String s=string.toLowerCase();
		int len1=s.length();
		int sum=0;
		for(int i=0;i<len1;i++)
			{
			char temp=s.charAt(i);
			if(Character.isLowerCase(temp))
			sum+=(temp-'a')+1;
			}
		String after=Integer.toBinaryString(sum);
		int len2=after.length();
		int count0=0;
		int count1=0;
		if(sum==0)
			System.out.print(0+" "+0);
		else
		{
			for(int i=0;i<len2;i++)
		{
			if(after.charAt(i)=='0')
				count0++;
			else
				count1++;
		}
		System.out.print(count0+" "+count1);
		}
	}
}
