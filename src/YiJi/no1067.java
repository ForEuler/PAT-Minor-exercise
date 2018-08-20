package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1067 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String[] s=in.readLine().split(" ");
		String pw=s[0];
		int times=Integer.parseInt(s[1]);
		int count=0;
		int flag=0;
		while(true)
		{
			String temp=in.readLine();
			if(temp==null||temp.equals("#"))
				break;
			else {
				if(temp.equals(pw))
				{ System.out.println("Welcome in");flag=1;}
				else
				{ if(flag==0)
				{System.out.println("Wrong password: "+temp);
				count++;
				if(count==times)
				{System.out.println("Account locked");break;}
				}}
			 }
				
		}
	in.close();
	}
}
