package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no1070 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(in.readLine());
		int[] number=new int[N];
		String[] temp=in.readLine().split(" ");
		in.close();
		for(int i=0;i<N;i++)
		{
			number[i]=Integer.parseInt(temp[i]);
		}
		Arrays.sort(number);
		float sum=(float)(number[0]+number[1])/2;
		for(int i=2;i<N;i++)
			sum=(float)(sum+number[i])/2;
		System.out.print((int)sum);
	}
}
