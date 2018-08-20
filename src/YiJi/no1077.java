package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1077 {
		public static void main(String[] args) throws IOException
		{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			String[] s1=in.readLine().split(" ");
			int N=Integer.parseInt(s1[0]);
			int M=Integer.parseInt(s1[1]);
			for(int i=0;i<N;i++)
			{
				int max=-1;
				int min=M+1;
				String[] temp=in.readLine().split(" ");
				int G1=Integer.parseInt(temp[0]);
				int count=0;
				int size=0;
				for(int j=1;j<N;j++)
				{
					int num=Integer.parseInt(temp[j]);
					if(num>=0&&num<=M)
					{
						size++;
					    if(num>max)
						  max=num;
					    if((num<min))
					    	min=num;
					    count+=num;
					}
				}
				count-=min;
				count-=max;
				size-=2;
				System.out.println( (int) (((1.0*count/size)+G1)/2.0+0.5));
				
			}
	}
}
