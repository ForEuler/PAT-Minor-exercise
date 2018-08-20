package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1066 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String[] s1=in.readLine().split(" ");
		int M=Integer.parseInt(s1[0]);
		int N=Integer.parseInt(s1[1]);
		int A=Integer.parseInt(s1[2]);
		int B=Integer.parseInt(s1[3]);
		int replace=Integer.parseInt(s1[4]);
		for(int i=0;i<M;i++)
		{
			String[] s=in.readLine().split(" ");
			for(int j=0;j<N;j++)
			{
				int temp=Integer.parseInt(s[j]);
				if(A<=temp&&temp<=B)
					temp=replace;
				if(i==M-1&&j==N-1)
					System.out.printf("%03d",temp);	
				 else if(j==N-1)
			        	 System.out.printf("%03d\n",temp);
				else 
					System.out.printf("%03d ", temp);
			}
		}
		in.close();
	}
}
