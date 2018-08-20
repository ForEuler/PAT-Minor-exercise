package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1082 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(in.readLine());
		String best="";
		int min=20001;
		String worst="";
		int max=-1;
		for(int i=0;i<N;i++)
		{
			String[] temp=in.readLine().split(" ");
			String name=temp[0];
			int x=Integer.parseInt(temp[1]);
			int y=Integer.parseInt(temp[2]);
			int sum=x*x+y*y;
			if(sum>max)
				{max=sum;worst=name;}
			if(sum<min)
			    {min=sum;best=name;}
		}
		in.close();
		System.out.print(best+" "+worst);
	}
}
