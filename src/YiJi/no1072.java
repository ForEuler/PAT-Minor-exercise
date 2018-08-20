package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1072 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String[] s1=in.readLine().split(" ");
		int N=Integer.parseInt(s1[0]);
		int M=Integer.parseInt(s1[1]);
		int countStu=0;
		int countItem=0;
		String[] items=in.readLine().split(" ");
		for(int i=0;i<N;i++)
		{
			int count=0;
			String[] temp=in.readLine().split(" ");
			int len=temp.length;
			String name=temp[0];
			String have="";
			for(int j=2;j<len;j++)
			{
				if(search(items, temp[j])==true)
					{
					 count++;
					 have+=temp[j]+" ";
					}
			}
			if(count!=0)
				{
				System.out.println((name+": "+have).trim());
				countStu++;
				countItem+=count;
				}
		}
		System.out.print(countStu+" "+countItem);
		
		
	}
	public static boolean search(String[] a,String b)
	{
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			if(a[i].equals(b))
				return true;
		}
		return false;
	}
}
