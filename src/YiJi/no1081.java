package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1081 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(in.readLine());
		for(int i=0;i<N;i++)
		{
			String pw=in.readLine();
			String res="";
			switch (Judge(pw))
		  {
			case 1: {res="Your password is wan mei.";break;}
			case 2: {res="Your password is tai duan le.";break;}
			case 3: {res="Your password is tai luan le.";break;}
			case 4: {res="Your password needs shu zi.";break;}
			case 5: {res= "Your password needs zi mu.";break;}
			default: break;
		  }
			System.out.println(res);
		}
	}
	static int Judge(String s)
	{
		int len=s.length();
		int countl=0;
		int countd=0;
		if(len<6)
			return 2;
		else
		{
			for(int i=0;i<len;i++)
			{
				char c=s.charAt(i);
				if(Character.isLetter(c))
					countl++;
				else if(c>='0'&&c<='9')
					countd++;
				else if(c=='.');
				else return 3;
					
			}
			if(countd==0&&countl!=0)
				return 4;
			else if(countl==0&&countd!=0)
				return 5;
			else 
				return 1;
				
			
		}
	}
}
