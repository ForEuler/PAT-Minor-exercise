package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1076 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(in.readLine());
		String res="";
		for(int i=0;i<N;i++)
		{
			String[] temp=in.readLine().split(" ");
			for(int j=0;j<4;j++)
			{
				if(temp[j].contains("T")==true)
				{res+=(temp[j].charAt(0)-'A'+1)+"";
				break;}
			}
		}
		in.close();
		System.out.print(res);
	}
}
