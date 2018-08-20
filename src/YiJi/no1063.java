package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class no1063 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(in.readLine());
		int max=0;
		for(int i=0;i<N;i++)
		{
			String[] temp=in.readLine().split(" ");
			int real=Integer.parseInt(temp[0]);
			int image=Integer.parseInt(temp[1]);
			int sum=real*real+image*image;
			if(sum>max)
				max=sum;		
		}
		System.out.printf("%.2f",Math.sqrt(max));
	}
}
